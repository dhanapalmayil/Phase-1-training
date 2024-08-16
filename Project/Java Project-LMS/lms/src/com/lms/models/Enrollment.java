package com.lms.models;

public class Enrollment {
    private int enrollmentId;
    private int userId;
    private int courseId;
    private String status;

    // Constructor
    public Enrollment(int enrollmentId, int userId, int courseId, String status) {
        this.enrollmentId = enrollmentId;
        this.userId = userId;
        this.courseId = courseId;
        this.status = status;
    }

    // Getters and setters
    public int getEnrollmentId() {
        return enrollmentId;
    }

    public void setEnrollmentId(int enrollmentId) {
        this.enrollmentId = enrollmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "enrollmentId=" + enrollmentId +
                ", userId=" + userId +
                ", courseId=" + courseId +
                ", status='" + status + '\'' +
                '}';
    }
}
