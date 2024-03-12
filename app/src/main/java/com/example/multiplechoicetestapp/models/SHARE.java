package com.example.multiplechoicetestapp.models;

import java.util.Date;

public class SHARE {
    private String username;
    private String topicSetCode;
    private Date sharedDate;
    private String sharedContent;

    private USER user;
    private TOPIC_SET topicSet;

    public SHARE() {
    }

    public SHARE(String username, String topicSetCode, Date sharedDate, String sharedContent, USER user, TOPIC_SET topicSet) {
        this.username = username;
        this.topicSetCode = topicSetCode;
        this.sharedDate = sharedDate;
        this.sharedContent = sharedContent;
        this.user = user;
        this.topicSet = topicSet;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTopicSetCode() {
        return topicSetCode;
    }

    public void setTopicSetCode(String topicSetCode) {
        this.topicSetCode = topicSetCode;
    }

    public Date getSharedDate() {
        return sharedDate;
    }

    public void setSharedDate(Date sharedDate) {
        this.sharedDate = sharedDate;
    }

    public String getSharedContent() {
        return sharedContent;
    }

    public void setSharedContent(String sharedContent) {
        this.sharedContent = sharedContent;
    }

    public USER getUser() {
        return user;
    }

    public void setUser(USER user) {
        this.user = user;
    }

    public TOPIC_SET getTopicSet() {
        return topicSet;
    }

    public void setTopicSet(TOPIC_SET topicSet) {
        this.topicSet = topicSet;
    }
}
