package com.studenthcmus;

import java.io.BufferedReader;

public class RandomGame {
    public String question;
    public String[] answers;
    public int userAnswer;
    public int correctAnswer;

    public RandomGame(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers;
        this.userAnswer = 0;
        this.correctAnswer = correctAnswer;
    }


    public String getQuestion() {
        return this.question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return this.answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return this.correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }
    public int getUserAnswer() {
        return this.userAnswer;
    }

    public boolean printResult() {
        if (this.userAnswer == -1) {
            System.out.println("You haven't answered yet!");
            return false;
        } else if (this.userAnswer == this.correctAnswer) {
            System.out.println("=====>Correct Answer!");
            System.out.println("\n   (-_-) Big deal!  \n");
            return true;
        } else {
            System.out.println("=====>Wrong Answer!");
            System.out.println("\n  (¬_¬) Too bad for you.  \n");
            return false;
        }
    }
    public void display() {
        for (int i = 1; i <= this.answers.length; i++) {
            System.out.println(i + ": " + this.answers[i-1]);
        }
    }

    public void run() {
        display();
        BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
        try {
            do {
                if(this.userAnswer <0 || this.userAnswer >= this.answers.length) {

                    System.out.println("Please enter a valid answer!");
                }
                System.out.print("Enter your answer: ");
                String line = reader.readLine();
                if(isNumeric(line)) {
                    this.userAnswer = Integer.parseInt(line)-1 ;
                }
                else {
                    this.userAnswer=-1;
                }

            } while (this.userAnswer < 0 || this.userAnswer >= this.answers.length);

        } catch (Exception e) {

        }

        if(! printResult()){System.out.println("*The correct answer is: " + this.answers[this.correctAnswer]);
        }
        private boolean isNumeric(String readLine) {
            try {
                Integer.parseInt(readLine);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
}
