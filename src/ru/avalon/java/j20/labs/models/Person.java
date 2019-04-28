package ru.avalon.java.j20.labs.models;

import java.util.Objects;

/**
 * Представление о человеке.
 */
public class Person{
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }

    @Override // метод описан в Object
    public boolean equals(Object otherObject) { //  сравнение на РАВЕНСТВО
        if (otherObject instanceof Person) { // проверка на то, является ли Object Person? Если да, то:
            Person otherPerson = (Person) otherObject; // (Person) - приведение к типу
            return name.equalsIgnoreCase(otherPerson.name)
                    && surname.equalsIgnoreCase(otherPerson.surname); // вернется true, если у двух разных Person равны и имя и фамилия - лексикографически равны
        }
        return false; // если otherObject не Person, то возвращаем false
    }

    @Override // метод описан в Object
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
