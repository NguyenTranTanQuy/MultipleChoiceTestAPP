package com.example.multiplechoicetestapp.models;


import java.util.Date;
import java.util.List;

public class USER {
    private String username;
    private String password;
    private String name;
    private int gender;
    private Date dayOfBirth;
    private String email;
    private List<SHARE> share;
    private List<TOPIC_SET> topicSet;
    private List<ASSIGNMENT> assignment;

    public USER() {
    }

    public USER(String username, String password, String name, int gender, Date dayOfBirth, String email, List<SHARE> share, List<TOPIC_SET> topicSet, List<ASSIGNMENT> assignment) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.email = email;
        this.share = share;
        this.topicSet = topicSet;
        this.assignment = assignment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Date getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<SHARE> getShare() {
        return share;
    }

    public void setShare(List<SHARE> share) {
        this.share = share;
    }

    public List<TOPIC_SET> getTopicSet() {
        return topicSet;
    }

    public void setTopicSet(List<TOPIC_SET> topicSet) {
        this.topicSet = topicSet;
    }

    public List<ASSIGNMENT> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<ASSIGNMENT> assignment) {
        this.assignment = assignment;
    }
}
