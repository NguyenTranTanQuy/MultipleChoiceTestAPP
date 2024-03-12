package com.example.multiplechoicetestapp.models;

import java.util.List;

public class QUESTION {
    private String questionCode;
    private String questionContent;
    private String answer;

    private TOPIC_SET topicSet;
    private List<SELECTION> selection;
    private List<DETAILED_ASSIGNMENT> detailedAssignments;

    public QUESTION() {
    }

    public QUESTION(String questionCode, String questionContent, String answer, TOPIC_SET topicSet, List<SELECTION> selection, List<DETAILED_ASSIGNMENT> detailedAssignments) {
        this.questionCode = questionCode;
        this.questionContent = questionContent;
        this.answer = answer;
        this.topicSet = topicSet;
        this.selection = selection;
        this.detailedAssignments = detailedAssignments;
    }

    public String getQuestionCode() {
        return questionCode;
    }

    public void setQuestionCode(String questionCode) {
        this.questionCode = questionCode;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public TOPIC_SET getTopicSet() {
        return topicSet;
    }

    public void setTopicSet(TOPIC_SET topicSet) {
        this.topicSet = topicSet;
    }

    public List<SELECTION> getSelection() {
        return selection;
    }

    public void setSelection(List<SELECTION> selection) {
        this.selection = selection;
    }

    public List<DETAILED_ASSIGNMENT> getDetailedAssignments() {
        return detailedAssignments;
    }

    public void setDetailedAssignments(List<DETAILED_ASSIGNMENT> detailedAssignments) {
        this.detailedAssignments = detailedAssignments;
    }
}
