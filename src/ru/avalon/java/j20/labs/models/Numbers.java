package ru.avalon.java.j20.labs.models;

public final class Numbers {

    /**
     * Скрытый конструктор, чтобы предотвратить создание
     * экземпляров данного типа.
     */
    private Numbers() {}

    /**
     * Возвращает сумму значений переданного массиа.
     * E - неизвестно что, но точно Number
     *
     * @param values массив чисел
     * @param <E> абстрактный класс, который расширяет Number
     * @return сумма элементов массива
     */
    public static <E extends Number> double sum(E[] values) {
        double sum = 0;
        //  value - придуманное название каждого элемента массива values; 
        // : - обозначение обращения к элементу массива
        //doubleValue - преобразование в тип double
        for (E value : values) sum += value.doubleValue(); 
        return sum;
    }

    /**
     * Выполняет поиск среднего арифметического заданного
     * массива чисел.
     *
     * @param values массив значений
     * @param <E> абстрактный класс, который расширяет Number
     * @return среднее арифметическое с точностью до типа {@code double}.
     */
    public static <E extends Number> double avg(E[] values) {
        return (double) sum(values) / values.length;
    }

    /**
     * Возвращает большее из дух переданных значений.
     *
     * @param a перое значение
     * @param b второе значение
     * @param <E> абстрактный класс, который расширяет Number
     * @return большее из двух значений
     */
    public static <E extends Number> double max(E a, E b) {
        return a.doubleValue() > b.doubleValue() ? a.doubleValue() : b.doubleValue();
    }

    /**
     * Выполняет поиск максимального значения в массиве.
     *
     * @param values массив значений
     * @param <E> абстрактный класс, который расширяет Number
     * @return максимальное значение массива
     */
    public static <E extends Number> double max(E[] values) {
        double result = values[0].doubleValue();
        for (int i = 1; i < values.length; i++) {
            result = max(result, values[i]);
        }
        return result;
    }

    /**
     * Возвращает меньшее из двух переданных значений.
     *
     * @param a первое значение
     * @param b второе значение
     * @param <E> абстрактный класс, который расширяет Number
     * @return меньшее из дух значений
     */
    public static <E extends Number> double min(E a, E b) {
        return a.doubleValue() < b.doubleValue() ? a.doubleValue() : b.doubleValue();
    }

    /**
     * Выполняет поиск минимального значения массива.
     *
     * @param values массив значений
     * @param <E> абстрактный класс, который расширяет Number
     * @return минимальное значение массива
     */
    public static <E extends Number> double min(E[] values) {
        double result = values[0].doubleValue();
        for (int i = 1; i < values.length; i++) {
            result = min(result, values[i]);
        }
        return result;
    }
}
