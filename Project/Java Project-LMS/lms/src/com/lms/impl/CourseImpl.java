package com.lms.impl;

import com.lms.intf.CourseIntf;
import com.lms.models.Course;
import com.lms.repository.CourseRepository;
import java.util.List;

public class CourseImpl implements CourseIntf {
	 private CourseRepository courseRepository;

	    public CourseImpl() {
	        this.courseRepository = new CourseRepository();
	    }

    @Override
    public void addCourse(Course course) {
    	courseRepository.addCourse(course);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getAllCourses();
    }

    @Override
    public void updateCourse(int courseID, Course course) {
    	courseRepository.updateCourse(courseID, course);
    }

    @Override
    public void deleteCourse(int courseId) {
    	courseRepository.deleteCourse(courseId);
    }
}
