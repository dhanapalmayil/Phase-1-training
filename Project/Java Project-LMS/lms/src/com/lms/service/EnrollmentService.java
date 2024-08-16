package com.lms.service;

import com.lms.impl.EnrollmentImpl;
import com.lms.intf.EnrollmentIntf;
import com.lms.models.Enrollment;
import java.util.List;
import java.util.Scanner;

public class EnrollmentService {
	private EnrollmentIntf enrollmentIntf;

    public EnrollmentService() {
        this.enrollmentIntf = new EnrollmentImpl();
    }


    public void addEnrollment(Enrollment enrollment) {
    	enrollmentIntf.addEnrollment(enrollment);
        System.out.println("Enrollment added successfully.");
    }

    public void updateEnrollment(int enrollmentId, Enrollment updatedEnrollment) {
    	enrollmentIntf.updateEnrollment(enrollmentId, updatedEnrollment);
        System.out.println("Enrollment updated successfully.");
    }

    public void deleteEnrollment(int enrollmentId) {
    	enrollmentIntf.deleteEnrollment(enrollmentId);
        System.out.println("Enrollment deleted successfully.");
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentIntf.getAllEnrollments();
    }

    public void manageEnrollments(Scanner scanner) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Enrollment Management");
            System.out.println("1. Add Enrollment");
            System.out.println("2. Update Enrollment");
            System.out.println("3. Delete Enrollment");
            System.out.println("4. List Enrollments");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Enrollment ID: ");
                    int enrollmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Enrollment Date (YYYY-MM-DD): ");
                    String enrollmentDate = scanner.nextLine();
                    Enrollment enrollment = new Enrollment(enrollmentId, userId, courseId, enrollmentDate);
                    addEnrollment(enrollment);
                    break;
                case 2:
                    System.out.print("Enter Enrollment ID to update: ");
                    int updateEnrollmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new User ID: ");
                    int newUserId = scanner.nextInt();
                    System.out.print("Enter new Course ID: ");
                    int newCourseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Enrollment Date (YYYY-MM-DD): ");
                    String newEnrollmentDate = scanner.nextLine();
                    Enrollment updatedEnrollment = new Enrollment(updateEnrollmentId, newUserId, newCourseId, newEnrollmentDate);
                    updateEnrollment(updateEnrollmentId, updatedEnrollment);
                    break;
                case 3:
                    System.out.print("Enter Enrollment ID to delete: ");
                    int deleteEnrollmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deleteEnrollment(deleteEnrollmentId);
                    break;
                case 4:
                    System.out.println("List of Enrollments:");
                    for (Enrollment e : getAllEnrollments()) {
                        System.out.println(e);
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
