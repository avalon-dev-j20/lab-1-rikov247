package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Fibonacci;

import java.util.Iterator;

/**
 * Задание №3. Выполнено.
 *
 * <p>
 * Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    /*
         * TODO(Преподаватель): До конца не понял, как работает "for..each" внутри
     */
    
    static void print(Iterable<? extends Number> numbers) {
        for (Number x : numbers) { // конструкция for..each, позволяющая обращаться к каждой итерации класса numbers
            System.out.print(x + " "); // выводим каждый элемент последовательности по очереди
        }
        System.out.println(""); // после вывода последовательности - переход на следующую строку
    }

    private static int sum; // переменная для хранения значения суммы последовательности

    static void printSumFibonacci(Iterable<? extends Number> numbers) {
        for (Number x : numbers) {
            sum += x.intValue(); // подсчет суммы последовательности
        }
        System.out.println("Sum = " + sum); // вывод значения суммы последовательности
        System.out.println(""); // после вывода последовательности - переход на следующую строку
    }

    @Override
    public void run() {
        Iterable<Integer> fibonacci = new Fibonacci(20); // обращаемся к создателю последовательности треугольны чисел.
        print(fibonacci); // выводим числа
        printSumFibonacci(fibonacci); // выводим сумму последовательности числе Фибонначи
    }
}
