package org.launchcode.java.studios.Six;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    ArrayList<String> possibleAnswer;
    int answerPosition;

    public MultipleChoice(int points, String question, ArrayList<String> possibleAnswer, int answerPosition) {
        super(points,question);
        this.possibleAnswer = possibleAnswer;
        this.answerPosition = answerPosition;
    }

    public ArrayList<String> getPossibleAnswer() {
        return possibleAnswer;
    }

    public void setPossibleAnswer(ArrayList<String> possibleAnswer) {
        this.possibleAnswer = possibleAnswer;
    }

    public int getAnswerPosition() {
        return answerPosition;
    }

    public void setAnswerPosition(int answerPosition) {
        this.answerPosition = answerPosition;
    }

    @Override
    public int getAnswer() {
        return 1;
    }
}
