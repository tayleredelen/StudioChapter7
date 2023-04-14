package org.example;

public class TrueFalseQuesion extends Question{

    //variables

    //constructor
    public TrueFalseQuesion(String quesion, String answer) {
        super(quesion, answer);
    }

    //method
    public boolean checkAnswer(String answer) { //true or false
        if (answer.toUpperCase().equals(getTheAnswer().toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }


}
