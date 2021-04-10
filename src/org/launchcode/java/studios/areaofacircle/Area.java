package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    static final double PI = 3.14;
    static double area;
    static double radius;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a radius: ");
        radius = input.nextDouble();
        area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius " + radius + " is:" +
                " " + area);
    }
}
