package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1. Выполнено
 *
 * <p>
 * Тема: "Создание обобщённых методов".
 *
 * <p>
 * В рамках задания требуется описать и выполнить несколько методов, обобщённых
 * с указанной точностью.
 */
public class Task1 implements Task {

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        Number[] array = arrayFactory.getInstance(20); // наполнение массива array другим, ранее созданным, массивом с 20 членами
        double min = Numbers.min(array); // поиск минимального значения массива
        double max = Numbers.max(array);// поиск минимального значения массива
        double avg = Numbers.avg(array); // поиск среднего арифметического, описанный в методе Numbers
        
        array = arrayFactory.getInstance(20, "Double"); // заполнение массива array ЧИСЛАМИ типа Double
        min = Numbers.min(array);
        max = Numbers.max(array);
        avg = Numbers.avg(array);
        
        array = arrayFactory.getInstance(20, "Float"); // заполнение массива array ЧИСЛАМИ типа Float
        min = Numbers.min(array);
        max = Numbers.max(array);
        avg = Numbers.avg(array);
    }
}
