package com.lms.models;

public class Assessment {
    private int id;
    private int courseId;
    private String name;
    private String date;
    private int maxScore;

    // Constructor
    public Assessment(int id, int courseId, String name, String date, int maxScore) {
        this.id = id;
        this.courseId = courseId;
        this.name = name;
        this.date = date;
        this.maxScore = maxScore;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    @Override
    public String toString() {
        return "Assessment{" +
                "id=" + id +
                ", courseId=" + courseId +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", maxScore=" + maxScore +
                '}';
    }
}
