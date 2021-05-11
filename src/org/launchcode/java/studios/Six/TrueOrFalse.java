package org.launchcode.java.studios.Six;

import java.util.Scanner;

public class TrueOrFalse extends Question{
    private boolean correctAnswer;

    public TrueOrFalse(int points, String questionText, boolean correctAnswer) {
        super(points, questionText);
        setPoints(1);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer(boolean possibleAnswer) {
        if (possibleAnswer == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void displayQuestion() {
        System.out.println("True or False: " + this.getQuestionText());
    }

    @Override
    public int getAnswer() {
        Scanner answer = new Scanner(System.in);
        System.out.println("What will your answer be? Type 't' for true or 'f' for False");
        displayQuestion();
        String userAnswer = answer.nextLine();

        if( userAnswer.indexOf('t') >= 0) {
            if (isCorrectAnswer(true)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (isCorrectAnswer(false)) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
