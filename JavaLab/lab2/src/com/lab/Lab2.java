package com.lab;

import java.util.Scanner;

public class Lab2 {

    public static void input(Point3d point) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\tВведите значение координаты X: ");
        double x1 = scanner.nextDouble();
        point.setX(x1);

        System.out.print("\tВведите значение координаты Y: ");
        double y1 = scanner.nextDouble();
        point.setY(y1);

        System.out.print("\tВведите значение координаты Z: ");
        double z1 = scanner.nextDouble();
        point.setZ(z1);
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double a = point1.distanceTo(point2), b = point2.distanceTo(point3), c = point3.distanceTo(point1), p, value;
        if (a == 0 || b == 0 || c == 0) {
            return 0;
        }
            p = (a + b + c) / 2;
            value = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            return (double) Math.round(value * 100d) / 100d;

    }
    public static void main(String[] args) {
        Point3d first = new Point3d();
        Point3d second = new Point3d();
        Point3d third = new Point3d();

        System.out.println("Первая точка");
        input(first);
        System.out.println("Вторая точка");
        input(second);
        System.out.println("Третья точка");
        input(third);

        boolean flag  = computeArea(first, second, third) == 0;
        if (flag) {
            System.out.println("Невозможно построить треугольник по заданным точкам");
        } else {
            System.out.println("Площадь треугольника: " + computeArea(first, second, third));
        }
    }
}