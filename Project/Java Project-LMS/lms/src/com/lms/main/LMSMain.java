package com.lms.main;

import com.lms.service.*;

import java.util.Scanner;

public class LMSMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        RoleService roleService = new RoleService();
        CourseService courseService = new CourseService();
        EnrollmentService enrollmentService = new EnrollmentService();
        AssessmentService assessmentService = new AssessmentService();
        ResultService resultService = new ResultService();

        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Learning Management System");
            System.out.println("1. Manage Users");
            System.out.println("2. Manage Roles");
            System.out.println("3. Manage Courses");
            System.out.println("4. Manage Enrollments");
            System.out.println("5. Manage Assessments");
            System.out.println("6. Manage Results");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userService.manageUsers(scanner);
                    break;
                case 2:
                    roleService.manageRoles(scanner);
                    break;
                case 3:
                	courseService.manageCourses(scanner);
                    break;
                case 4:
                	enrollmentService.manageEnrollments(scanner);
                    break;
                case 5:
                	assessmentService.manageAssessments(scanner);
                    break;
                case 6:
                	resultService.manageResults(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
   

    

    
}
