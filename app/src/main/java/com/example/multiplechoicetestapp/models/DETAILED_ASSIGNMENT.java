package com.example.multiplechoicetestapp.models;

import java.util.List;

public class DETAILED_ASSIGNMENT {
    private String selectedAnswer;
    private List<ASSIGNMENT> assignment;
    private List<QUESTION> question;

    public DETAILED_ASSIGNMENT() {
    }

    public DETAILED_ASSIGNMENT(String selectedAnswer, List<ASSIGNMENT> assignment, List<QUESTION> question) {
        this.selectedAnswer = selectedAnswer;
        this.assignment = assignment;
        this.question = question;
    }

    public String getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(String selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    public List<ASSIGNMENT> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<ASSIGNMENT> assignment) {
        this.assignment = assignment;
    }

    public List<QUESTION> getQuestion() {
        return question;
    }

    public void setQuestion(List<QUESTION> question) {
        this.question = question;
    }
}
