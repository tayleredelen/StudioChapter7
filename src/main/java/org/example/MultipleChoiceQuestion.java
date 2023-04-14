package org.example;

public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer); //super allows access to parent
    }

    @Override
    public boolean checkAnswer(String answer) { //answer should be A, B, C, or D
        String actualAnswer = this.getTheAnswer();
        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        } else {
            return false;
        }

    }
}
