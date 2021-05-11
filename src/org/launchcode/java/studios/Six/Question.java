package org.launchcode.java.studios.Six;

public abstract class Question {
    private String questionText;
    private int points;
//    private double score;

    public Question(int points, String questionText) {
        this.points = points;
        this.questionText = questionText;
    }



    public void setPoints(int x) {
        this.points = x;
    }

    public int getPoints() {
        return this.points;
    }

    public String getQuestionText() {
        return this.questionText;
    }

    public abstract int getAnswer();

    public abstract void displayQuestion();


}
