package com.lms.impl;

import com.lms.intf.CourseIntf;
import com.lms.models.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements CourseIntf {
    private List<Course> courses = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        courses.add(course);
    }

    @Override
    public Course getCourse(int courseId) {
        return courses.stream().filter(c -> c.getCourseId() == courseId).findFirst().orElse(null);
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public void updateCourse(Course course) {
        courses.replaceAll(c -> c.getCourseId() == course.getCourseId() ? course : c);
    }

    @Override
    public void deleteCourse(int courseId) {
        courses.removeIf(c -> c.getCourseId() == courseId);
    }
}
