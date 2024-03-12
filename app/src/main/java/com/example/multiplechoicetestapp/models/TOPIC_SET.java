package com.example.multiplechoicetestapp.models;

import java.util.Date;
import java.util.List;

public class TOPIC_SET {
    private String topicSetCode;
    private String topicSetName;
    private Date created;
    private Float duration;
    private List<SHARE> share;
    private TOPIC topic;
    private List<QUESTION> question;

    public TOPIC_SET() {
    }

    public TOPIC_SET(String topicSetCode, String topicSetName, Date created, Float duration, List<SHARE> share, TOPIC topic, List<QUESTION> question) {
        this.topicSetCode = topicSetCode;
        this.topicSetName = topicSetName;
        this.created = created;
        this.duration = duration;
        this.share = share;
        this.topic = topic;
        this.question = question;
    }

    public String getTopicSetCode() {
        return topicSetCode;
    }

    public void setTopicSetCode(String topicSetCode) {
        this.topicSetCode = topicSetCode;
    }

    public String getTopicSetName() {
        return topicSetName;
    }

    public void setTopicSetName(String topicSetName) {
        this.topicSetName = topicSetName;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public List<SHARE> getShare() {
        return share;
    }

    public void setShare(List<SHARE> share) {
        this.share = share;
    }

    public TOPIC getTopic() {
        return topic;
    }

    public void setTopic(TOPIC topic) {
        this.topic = topic;
    }

    public List<QUESTION> getQuestion() {
        return question;
    }

    public void setQuestion(List<QUESTION> question) {
        this.question = question;
    }
}
