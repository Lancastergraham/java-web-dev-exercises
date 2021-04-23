package org.launchcode.java.studios.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class CountingCharacters {
    //Write a program that counts the numbers of each character.
    //Print the results.

    public static String myString = "If the product of two terms is zero then common " +
            "sense says at least one of the two terms has " +
            "to be zero to start with. So if you move all the terms " +
            "over to one side, you can put the quadratics into a " +
            "form that can be factored allowing that side of the " +
            "equation to equal zero. Once you’ve done that, it’s " +
            "pretty straightforward from there.";

    public static char[] charactersInString = myString.toLowerCase().toCharArray();

    public static HashMap<Character, Integer> JennaBMap = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        helpMe(charactersInString, JennaBMap);

        //Find out the directory.
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("The current working directory is " + currentDirectory);


        File myObj = new File("inputFile.txt");
        Scanner myReader = new Scanner(myObj);

        printMap(JennaBMap);

        Scanner input = new Scanner(System.in);

        System.out.println("\nEnter a Sentence to be mapped out!");
        String words = input.nextLine();

        char[] haveFun = words.toLowerCase().toCharArray();
        HashMap<Character, Integer> happyMap = new HashMap<>();

        helpMe(haveFun, happyMap);
        printMap(happyMap);

        String fileReader = "";
        char[] fileChar;
        HashMap<Character, Integer> fileTest = new HashMap<>();

        while (myReader.hasNextLine()) {
            fileReader += myReader.nextLine();
        }

        myReader.close();
        input.close();

        fileChar = fileReader.toLowerCase().toCharArray();

        System.out.println("\n");
        helpMe(fileChar, fileTest);
        printMap(fileTest);


    }

    private static void printMap(HashMap<Character, Integer> theMap) {
        for (Map.Entry<Character, Integer> displayMap : theMap.entrySet()) {
            System.out.println(displayMap.getKey() + ": " + displayMap.getValue());
        }
    }

    private static void helpMe(char[] charArray, HashMap<Character, Integer> theMap) {
        for (int i = 0; i < charArray.length; i++) {
            //If it doesn't already have the key, add it to the map!
            if (!theMap.containsKey(charArray[i]) && Character.isLetter(charArray[i])){
                theMap.put(charArray[i], 1);
            } else if (theMap.containsKey(charArray[i])) {
                int count = theMap.get(charArray[i]);
                theMap.put(charArray[i], count + 1);
            }
        }
    }
}
