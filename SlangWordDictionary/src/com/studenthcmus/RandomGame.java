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



}