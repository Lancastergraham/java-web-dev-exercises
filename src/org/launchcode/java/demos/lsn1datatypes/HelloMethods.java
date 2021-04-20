package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("sp");
        System.out.println(message);
        int[] apple = new int[10];
        int[] someInts = {0, 1, 3, 5};
        apple[0] = 5;

        int[] numbs = {1, 1, 2, 3, 5, 8, 13, 21};

        for (int i : numbs) {
            System.out.println(i);
            System.out.println("f-art");
        }

        String msg = "Hello World";

        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }

        System.out.println(apple[9]);
        System.out.println(someInts[2]);
    }

}
