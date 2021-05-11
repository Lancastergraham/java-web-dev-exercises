package org.launchcode.java.studios.Six;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {
    public static void main(String[] args) {
        //Question trueFalse = new TrueOrFalse("Is today the 10th");

        ArrayList<String> possibleAnswers = new ArrayList<>(Arrays.asList("Apple", "Pear", "Bear", "Kiwi"));

        Question multiChoice = new MultipleChoice("What is an animal", possibleAnswers, 2  );

        //ArrayList<Question> quiz = new ArrayList<>();
        //trueFalse.answer(("True"));
    }
}
