package com.example.multiplechoicetestapp.models;

import java.util.Date;
import java.util.List;

public class ASSIGNMENT {
    private String assignmentCode;
    private Date testDate;
    private Float score;
    private int nb_completedSentences;
    private Float duration;
    private USER user;
    private List<DETAILED_ASSIGNMENT> detailedAssignments;

    public ASSIGNMENT() {
    }

    public ASSIGNMENT(String assignmentCode, Date testDate, Float score, int nb_completedSentences, Float duration, USER user, List<DETAILED_ASSIGNMENT> detailedAssignments) {
        this.assignmentCode = assignmentCode;
        this.testDate = testDate;
        this.score = score;
        this.nb_completedSentences = nb_completedSentences;
        this.duration = duration;
        this.user = user;
        this.detailedAssignments = detailedAssignments;
    }

    public String getAssignmentCode() {
        return assignmentCode;
    }

    public void setAssignmentCode(String assignmentCode) {
        this.assignmentCode = assignmentCode;
    }

    public Date getTestDate() {
        return testDate;
    }

    public void setTestDate(Date testDate) {
        this.testDate = testDate;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public int getNb_completedSentences() {
        return nb_completedSentences;
    }

    public void setNb_completedSentences(int nb_completedSentences) {
        this.nb_completedSentences = nb_completedSentences;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public USER getUser() {
        return user;
    }

    public void setUser(USER user) {
        this.user = user;
    }

    public List<DETAILED_ASSIGNMENT> getDetailedAssignments() {
        return detailedAssignments;
    }

    public void setDetailedAssignments(List<DETAILED_ASSIGNMENT> detailedAssignments) {
        this.detailedAssignments = detailedAssignments;
    }
}
