package exercises.lesson.three;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static int sumTheNumbs(ArrayList<Integer> toBeSummed) {
        int bigCount = 0;
        for (int bigGuy : toBeSummed) {
            if (bigGuy % 2 == 0) {
                bigCount += bigGuy;
            }
        }
        return bigCount;
    }

    public static void printFiveLetterWords(String[] array, int wordLength) {
        for (String s : array) {
            if (s.length() == wordLength) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args){
        int[] numbs = {0, 2, 4, 6, 8, 10, 12, 1, 3, 4, 5};
        Scanner input = new Scanner(System.in);
        System.out.println("How many letters?");
        int howManyLetters = input.nextInt();
        ArrayList<Integer> stuff = new ArrayList<>();
        for (int numb : numbs) {
            stuff.add(numb);
        }

        String[] testStrings = {"apple", "bugs", "Mouth"};


        printFiveLetterWords(testStrings, howManyLetters);

        System.out.println(sumTheNumbs(stuff));

    }
}
