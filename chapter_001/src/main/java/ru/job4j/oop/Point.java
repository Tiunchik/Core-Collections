/**
 * Тестовое задание по рефакторингу кода поиска расстояния между двумя точками.
 *
 * @author Maksim Tiunchik
 */
package ru.job4j.oop;

/**
 * Класс точка, представляет из себя точку в двухмерной системе координат
 *
 * @author Maksim Tiunchik (senebh@gmail.com)
 * @version 0.1
 * @since 11.12.2019
 */
public class Point {
    /**
     * Переменная показывает местоположение точки на оси Х
     */
    private int x;
    /**
     * Переменная показывает местоположение точки на оси Y
     */
    private int y;
    /**
     * Переменная показывает местоположение точки на оси Z
     */
    private int z;

    /**
     * Конструктор класс Point, задаёт значения переменных экземпляра x и y
     *
     * @param xdot - задает значение переменной х
     * @param ydot - задает значение переменной y
     */
    public Point(int xdot, int ydot) {
        this.x = xdot;
        this.y = ydot;
    }

    /**
     * Конструктор класс Point, задаёт значения переменных экземпляра x, y, z
     *
     * @param xdot - задает значение переменной х
     * @param ydot - задает значение переменной y
     * @param zdot - задаёт значение переменной z
     */
    public Point(int xdot, int ydot, int zdot) {
        this.x = xdot;
        this.y = ydot;
        this.z = zdot;
    }

    /**
     * Метод поиска расстояния между двумя объектами Point в двухмерной системе координат
     *
     * @param that - точка растояние до которой необходимо найти
     * @return - возвращаеме значение double - расстояние
     */
    public double distance(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2));
    }

    /**
     * Метод поиска расстояния между двумя объектами Point в трёхмерной системе координат
     *
     * @param that - точка растояние до которой необходимо найти
     * @return - возвращаеме значение double - расстояние
     */
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y, 2) + Math.pow(that.z - this.z, 2));
    }

    /**
     * метод main
     *
     * @param args - args.
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }

}
