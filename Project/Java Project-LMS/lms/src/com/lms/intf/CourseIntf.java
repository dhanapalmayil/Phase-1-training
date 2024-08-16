package com.lms.intf;

import com.lms.models.Course;
import java.util.List;

public interface CourseIntf {
    void addCourse(Course course);
    List<Course> getAllCourses();
    void updateCourse(int courseID, Course course);
    void deleteCourse(int courseId);
}
