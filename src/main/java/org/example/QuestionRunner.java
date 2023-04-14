package org.example;

public class QuestionRunner {
    //keeping main in one class is helpful when classes are more complex
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion("What sound does a cat make?", "A: Quack\n B: Moo\n C: Meow\n D: Woof");
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBoxQuestion myCheckBoxQuestion = new CheckBoxQuestion("Select all animals that can fly", "A: Duck\n B: Cow\n C: Robin\n D: Squirrel");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuesion myTrueFalseQuestion = new TrueFalseQuesion("Snakes can walk", "False");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();

        }

}
