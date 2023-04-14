package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz  {
    //add questions, run quiz, and grade quiz
    //variables
    private ArrayList<Question> questions = new ArrayList<>();
    private int numberOfQuestionsCorrect = 0;
    private Scanner scanner = new Scanner(System.in);

    //constructor
    public Quiz() {

    }

    //methods
    public void addQuestion(Question question) {
        this.questions.add(question);
    }

    public void runQuiz() {
        //loop thru each question
        for (Question question : questions) {
            //ask user question
            System.out.println(question.getTheQuestion());
            //get user answer
            String userAnswer = this.getUserAnswers();
            //check answer
            boolean userGotQuestionCorrect = question.checkAnswer(userAnswer); //returns boolean
            if (userGotQuestionCorrect == true) {
                this.numberOfQuestionsCorrect ++;

            }
        }
        //grade quiz
        double percentageCorrect = (this.numberOfQuestionsCorrect/questions.size()) * 100;
        System.out.println("Final grade: " + percentageCorrect + "%");
    }

    private String getUserAnswers() {
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }



}

