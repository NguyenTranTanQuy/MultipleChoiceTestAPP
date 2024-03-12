package com.example.multiplechoicetestapp.models;

public class SELECTION {
    private int selectionID;
    private String selectionContent;
    private QUESTION question;

    public SELECTION() {
    }

    public SELECTION(int selectionID, String selectionContent, QUESTION question) {
        this.selectionID = selectionID;
        this.selectionContent = selectionContent;
        this.question = question;
    }

    public int getSelectionID() {
        return selectionID;
    }

    public void setSelectionID(int selectionID) {
        this.selectionID = selectionID;
    }

    public String getSelectionContent() {
        return selectionContent;
    }

    public void setSelectionContent(String selectionContent) {
        this.selectionContent = selectionContent;
    }

    public QUESTION getQuestion() {
        return question;
    }

    public void setQuestion(QUESTION question) {
        this.question = question;
    }
}
