package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
        Cat garfield = new HouseCat("Garfield");
        garfield.eat();
        System.out.println(garfield.isTired());

        Cat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());

        Cat weight = new HouseCat(12);
        System.out.println(weight.purr());
    }
}
