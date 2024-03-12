package com.example.multiplechoicetestapp.models;

import java.util.List;

public class TOPIC {
    private String topicCode;
    private String topicName;
    private List<TOPIC_SET> topicSet;
    private USER user;

    public TOPIC() {
    }

    public TOPIC(String topicCode, String topicName, List<TOPIC_SET> topicSet, USER user) {
        this.topicCode = topicCode;
        this.topicName = topicName;
        this.topicSet = topicSet;
        this.user = user;
    }

    public String getTopicCode() {
        return topicCode;
    }

    public void setTopicCode(String topicCode) {
        this.topicCode = topicCode;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public List<TOPIC_SET> getTopicSet() {
        return topicSet;
    }

    public void setTopicSet(List<TOPIC_SET> topicSet) {
        this.topicSet = topicSet;
    }

    public USER getUser() {
        return user;
    }

    public void setUser(USER user) {
        this.user = user;
    }
}
