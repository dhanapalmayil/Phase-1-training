package com.lms.repository;

import com.lms.models.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void updateCourse(int courseId, Course updatedCourse) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId() == courseId) {
                courses.set(i, updatedCourse);
                break;
            }
        }
    }

    public void deleteCourse(int courseId) {
        courses.removeIf(course -> course.getCourseId() == courseId);
    }

    public List<Course> getAllCourses() {
        return new ArrayList<>(courses);
    }
}
