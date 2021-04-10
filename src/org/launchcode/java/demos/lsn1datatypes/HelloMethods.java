package org.launchcode.java.demos.lsn1datatypes;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("sp");
        System.out.println(message);
        int[] apple = new int[10];
        int[] someInts = {0, 1, 3, 5};
        apple[0] = 5;

        System.out.println(apple[9]);
        System.out.println(someInts[2]);
    }

}
