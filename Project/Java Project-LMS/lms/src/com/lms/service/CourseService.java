package com.lms.service;

import com.lms.models.Course;
import com.lms.repository.CourseRepository;
import java.util.List;

public class CourseService {
    private CourseRepository courseRepository;

    public CourseService() {
        this.courseRepository = new CourseRepository();
    }

    public void addCourse(Course course) {
        courseRepository.addCourse(course);
    }

    public void updateCourse(int courseId, Course updatedCourse) {
        courseRepository.updateCourse(courseId, updatedCourse);
    }

    public void deleteCourse(int courseId) {
        courseRepository.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }
}
