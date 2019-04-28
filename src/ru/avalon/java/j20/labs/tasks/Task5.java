package ru.avalon.java.j20.labs.tasks;

import java.util.*;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

/**
 * Задание №5. Выполнено.
 *
 * <p>
 * Тема: "Изучение отличия между списками и наборами". Списки (List) могут
 * содержать одинаковые элементы, а множества (Set) содержат только разные
 * элемента. Множества (Set) — неупорядоченные коллекции (элементы заносятся не
 * по порядку их дообавления), списки (List) — упорядоченные, где каждый элемент
 * имеет индекс (заносятся по порядку их добавления).
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        final Number[] array = arrayFactory.getInstance(20);

        List<Integer> list = new ArrayList<>();
        for (Number E : array) { // обращение к каждому члену массива array
            list.add(E.intValue()); // добавление элементов в массив
        }

        Set<Integer> set = new HashSet<>();
        for (Number E : array) { // обращение к каждому члену массива array
            set.add(E.intValue()); // добавление элементов в массив
        }
    }
}
