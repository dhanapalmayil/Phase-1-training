package com.lms.service;

import com.lms.models.Course;
import com.lms.repository.CourseRepository;
import java.util.List;
import com.lms.intf.*;
public class CourseService implements CourseIntf{
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

	@Override
	public Course getCourse(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		
	}
}
