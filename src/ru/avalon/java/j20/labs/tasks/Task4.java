package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Person;

/**
 * Задание №4. Выполнено.
 *
 * <p>
 * Тема: "Методы класса {@link Object}". Сравнение двух ЧЕЛОВЕК на идентичность
 * с помощью переопределения методов класса Object.
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Person a = new Person("иван", "Иванов");
        Person b = new Person("Иван", "Иванов");
        boolean isEqual = a.equals(b); // Сравнение происходит без учета регистра, так как важен смысл, а не регистр
    }
}
