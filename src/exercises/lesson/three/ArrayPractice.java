package exercises.lesson.three;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] arrayNums = {1, 1, 2, 3, 5, 8};

        //Unmodified
//        for (int nums : arrayNums) {
//            System.out.println(nums);
//        }
        //modified
        for (int arrayNum : arrayNums) {
            if (arrayNum % 2 != 0) {
                System.out.println(arrayNum);
            }
        }

        String sentence = "I would not, could not, in a box." +
                " I would not, could not with a fox." +
                " I will not eat them in a house." +
                " I will not eat them with a mouse.";

        String[] sentenceArray = sentence.split(Pattern.quote("."));

        System.out.println(Arrays.toString(sentenceArray));
    }//end of main
}
