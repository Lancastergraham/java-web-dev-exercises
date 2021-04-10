package exercises;

import java.util.Scanner;

public class NumericTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int width;

        double miles;
        double gallons;

        System.out.println("Enter the length of a rectangle.");
        length = input.nextInt();
        System.out.println("Enter the width of a rectangle.");
        width = input.nextInt();

        System.out.println("The area of your rectangle is: "
                + length * width);

        System.out.println("\n" + "Enter miles traveled.");
        miles = input.nextInt();
        System.out.println("Enter gas per gallon used.");
        gallons = input.nextInt();

        System.out.println("Your miles per gallon is: "
                + miles / gallons);
    }
}
