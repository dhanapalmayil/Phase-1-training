package com.lms.service;

import com.lms.impl.CourseImpl;
import com.lms.intf.CourseIntf;
import com.lms.models.Course;
import java.util.List;
import java.util.Scanner;

public class CourseService {
	private CourseIntf courseIntf;

    public CourseService() {
        this.courseIntf = new CourseImpl();
    }

    public void addCourse(Course course) {
    	courseIntf.addCourse(course);
        System.out.println("Course added successfully.");
    }

    public void updateCourse(int courseId, Course updatedCourse) {
    	courseIntf.updateCourse(courseId, updatedCourse);
        System.out.println("Course updated successfully.");
    }

    public void deleteCourse(int courseId) {
    	courseIntf.deleteCourse(courseId);
        System.out.println("Course deleted successfully.");
    }

    public List<Course> getAllCourses() {
        return courseIntf.getAllCourses();
    }

    public void manageCourses(Scanner scanner) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Course Management");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. List Courses");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course Name: ");
                    String courseName = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Start Date (YYYY-MM-DD): ");
                    String startDate = scanner.nextLine();
                    System.out.print("Enter End Date (YYYY-MM-DD): ");
                    String endDate = scanner.nextLine();
                    Course course = new Course(courseId, courseName, description, startDate, endDate);
                    addCourse(course);
                    break;
                case 2:
                    System.out.print("Enter Course ID to update: ");
                    int updateCourseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Course Name: ");
                    String newCourseName = scanner.nextLine();
                    System.out.print("Enter new Description: ");
                    String newDescription = scanner.nextLine();
                    System.out.print("Enter new Start Date (YYYY-MM-DD): ");
                    String newStartDate = scanner.nextLine();
                    System.out.print("Enter new End Date (YYYY-MM-DD): ");
                    String newEndDate = scanner.nextLine();
                    Course updatedCourse = new Course(updateCourseId, newCourseName, newDescription, newStartDate, newEndDate);
                    updateCourse(updateCourseId, updatedCourse);
                    break;
                case 3:
                    System.out.print("Enter Course ID to delete: ");
                    int deleteCourseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deleteCourse(deleteCourseId);
                    break;
                case 4:
                    System.out.println("List of Courses:");
                    for (Course c : getAllCourses()) {
                        System.out.println(c);
                    }
                    break;
                case 0:
                    System.out.println("Returning to Main Menu...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
