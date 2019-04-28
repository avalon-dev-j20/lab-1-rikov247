package ru.avalon.java.j20.labs.models;

/**
 * Модель представления о точке.
 */
public class Point {
    /**
     * Абсцисса точки.
     */
    private final Double x;
    /**
     * Ордината точки.
     */
    private final Double y;

    /**
     * Основной конструктор класса.
     *
     * @param x абсцисса точки
     * @param y ордината точки
     */
    public <E extends Number> Point(E x, E y) {
        this.x = x.doubleValue();
        this.y = y.doubleValue();
    }

    /**
     * Возвращает абсциссу точки.
     *
     * @return x-координата точки.
     */
    public double getX() {
        return x;
    }

    /**
     * Возвращает ординату точки.
     *
     * @return y-координата точки.
     */
    public double getY() {
        return y;
    }

    /**
     * Возвращает дистанцию от точки до точки.
     *
     * @param point точка, до которой следует вычислить
     *              дистанцию.
     * @return дистанция между точками
     */
    public double distanceTo(Point point) {
        double dx = x - point.x; // х - координата точки, от которой берут метод; point.x - координата точки, до которой считают дистанцию
        double dy = y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
