package org.example;

public abstract class Question {
    //variables, question and answer. made final so they never change
    private final String theQuesion;
    private final String theAnswer;

    //constructors
    public Question(String question, String answer) {
        this.theQuesion = question;
        this.theAnswer = answer;
    }

    //getters, no setters since QandA won't change/are final
    public String getTheQuestion() { return this.theQuesion; }
    public String getTheAnswer() { return this.theAnswer; }

    //methods
    public abstract boolean checkAnswer(String answer);

}

