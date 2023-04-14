package org.example;

public class CheckBoxQuestion extends Question {

    //variables

    //constructor
    public CheckBoxQuestion(String quesion, String answer) {
        super(quesion, answer);
    }

    //method
    public boolean checkAnswer(String answer) {
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

}