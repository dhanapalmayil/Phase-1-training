package com.lms.intf;

import com.lms.models.Course;
import java.util.List;

public interface CourseIntf {
    void addCourse(Course course);
    Course getCourse(int courseId);
    List<Course> getAllCourses();
    void updateCourse(Course course);
    void deleteCourse(int courseId);
}
