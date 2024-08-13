package com.lms.models;

public class Result {
    private int resultId;
    private int assessmentId;
    private int userId;
    private int score;

    // Constructor
    public Result(int resultId, int assessmentId, int userId, int score) {
        this.resultId = resultId;
        this.assessmentId = assessmentId;
        this.userId = userId;
        this.score = score;
    }

    // Getters and Setters
    public int getResultId() {
        return resultId;
    }

    public void setResultId(int resultId) {
        this.resultId = resultId;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Result{" +
                "resultId=" + resultId +
                ", assessmentId=" + assessmentId +
                ", userId=" + userId +
                ", score=" + score +
                '}';
    }
}
