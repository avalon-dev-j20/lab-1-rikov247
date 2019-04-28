package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.models.Point;

/**
 * Задание №2. Выполнено.
 *
 * <p>Тема: "Создание обобщённых классов".
 */
public class Task2 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() { 
        Point a = new Point(1f, 1f); // точка с координатами заданными значениями типа float
        Point b = new Point(2, 2); // точка с координатами заданными значениями типа int
        double distanceTo = a.distanceTo(b); // дистанция от точки a до точки b
    }
}
