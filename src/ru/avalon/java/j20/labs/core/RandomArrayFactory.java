package ru.avalon.java.j20.labs.core;

import java.util.Random;

/**
 * Фабрика, создающая массивы чисел, наполненные случайными значениями.
 */
public class RandomArrayFactory implements Factory<Number[], Integer> {

    /**
     * Генератор псевдо-случайных чисел.
     */
    private final Random random = new Random();

    /**
     * Возвращает новый массив заданной длины. Массив содержит случайные
     * значения в диапазоне от 1 до 100.
     *
     * @param length длина массива
     * @return новый массив случайных чисел, заданной длины.
     */
    @Override
    public Number[] getInstance(Integer length) {
        Number[] array = new Number[length]; // создается пустой массив ЧИСЕЛ (Number) длинной length
        for (int i = 0; i < length; i++) { // здесь описывается то, чем и как будет заполняться массив
            array[i] = random.nextInt(101);
        }
        return array;
    }

    // Перегрузка метода, для возможности выбора типа наполняющих массив данных. Для проверки.
    public Number[] getInstance(Integer length, String DataType) {
        Number[] array = new Number[length]; // создается пустой массив ЧИСЕЛ (Number) длинной length
        for (int i = 0; i < length; i++) { // здесь описывается то, чем и как будет заполняться массив
            switch (DataType) { // в зависимости от того, какое значение будет у DataType, выбирается один из вариантов
                case "Integer":
                    array[i] = random.nextInt(101);
                    break;
                case "Double":
                    array[i] = 99 * random.nextDouble() + 1;
                    break;
                case "Float":
                    array[i] = 99 * random.nextFloat() + 1;
                    break;
                default: // Если написать не правильное значени для String, то по дефолту массив заполнится числами типа int
                    array[i] = random.nextInt(101);
                    break;
            }
        }
        return array;
    }
}
