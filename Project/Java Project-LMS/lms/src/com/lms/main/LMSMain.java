package com.lms.main;

import com.lms.models.*;
import com.lms.service.*;
import com.lms.intf.*;
import java.util.Scanner;

public class LMSMain {
    public static void main(String[] args) {
    	   UserIntf userService = new UserService();
           RoleIntf roleService = new RoleService();
           CourseIntf courseService = new CourseService();
           EnrollmentIntf enrollmentService = new EnrollmentService();
           AssessmentIntf assessmentService = new AssessmentService();
           ResultIntf resultService = new ResultService();

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
                    manageUsers(scanner, userService);
                    break;
                case 2:
                    manageRoles(scanner, roleService);
                    break;
                case 3:
                    manageCourses(scanner, courseService);
                    break;
                case 4:
                    manageEnrollments(scanner, enrollmentService);
                    break;
                case 5:
                    manageAssessments(scanner, assessmentService);
                    break;
                case 6:
                    manageResults(scanner, resultService);
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

    // User Management
    private static void manageUsers(Scanner scanner, UserIntf userService) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("User Management");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. List Users");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Role ID: ");
                    int roleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Role role = new Role(roleId, "Role Name"); // Adjust as needed
                    User user = new User(userId, username, email, role);
                    userService.addUser(user);
                    System.out.println("User added successfully.");
                    break;
               
                case 3:
                    System.out.print("Enter User ID to delete: ");
                    int deleteUserId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    userService.deleteUser(deleteUserId);
                    System.out.println("User deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Users:");
                    for (User u : userService.getAllUsers()) {
                        System.out.println(u);
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

    // Role Management
    private static void manageRoles(Scanner scanner, RoleIntf roleService) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Role Management");
            System.out.println("1. Add Role");
            System.out.println("2. Update Role");
            System.out.println("3. Delete Role");
            System.out.println("4. List Roles");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Role ID: ");
                    int roleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Role Name: ");
                    String roleName = scanner.nextLine();
                    Role role = new Role(roleId, roleName);
                    roleService.addRole(role);
                    System.out.println("Role added successfully.");
                    break;
               
                case 3:
                    System.out.print("Enter Role ID to delete: ");
                    int deleteRoleId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    roleService.deleteRole(deleteRoleId);
                    System.out.println("Role deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Roles:");
                    for (Role r : roleService.getAllRoles()) {
                        System.out.println(r);
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

    // Course Management
    private static void manageCourses(Scanner scanner, CourseIntf courseService) {
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
                    courseService.addCourse(course);
                    System.out.println("Course added successfully.");
                    break;
                
                case 3:
                    System.out.print("Enter Course ID to delete: ");
                    int deleteCourseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    courseService.deleteCourse(deleteCourseId);
                    System.out.println("Course deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Courses:");
                    for (Course c : courseService.getAllCourses()) {
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

    // Enrollment Management
    private static void manageEnrollments(Scanner scanner, EnrollmentIntf enrollmentService) {
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
                    System.out.print("Enter Enrollment Date (YYYY-MM-DD): ");
                    String enrollmentDate = scanner.nextLine();
                    Enrollment enrollment = new Enrollment(enrollmentId, userId, courseId, enrollmentDate);
                    enrollmentService.addEnrollment(enrollment);
                    System.out.println("Enrollment added successfully.");
                    break;
               
                case 3:
                    System.out.print("Enter Enrollment ID to delete: ");
                    int deleteEnrollmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    enrollmentService.deleteEnrollment(deleteEnrollmentId);
                    System.out.println("Enrollment deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Enrollments:");
                    for (Enrollment e : enrollmentService.getAllEnrollments()) {
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

    // Assessment Management
    private static void manageAssessments(Scanner scanner, AssessmentIntf assessmentService) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Assessment Management");
            System.out.println("1. Add Assessment");
            System.out.println("2. Update Assessment");
            System.out.println("3. Delete Assessment");
            System.out.println("4. List Assessments");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Assessment ID: ");
                    int assessmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Course ID: ");
                    int courseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Assessment Name: ");
                    String assessmentName = scanner.nextLine();
                    System.out.print("Enter Assessment Date (YYYY-MM-DD): ");
                    String assessmentDate = scanner.nextLine();
                    System.out.print("Enter Max Score: ");
                    int maxScore = scanner.nextInt();
                    Assessment assessment = new Assessment(assessmentId, courseId, assessmentName, assessmentDate, maxScore);
                    assessmentService.addAssessment(assessment);
                    System.out.println("Assessment added successfully.");
                    break;
             
                case 3:
                    System.out.print("Enter Assessment ID to delete: ");
                    int deleteAssessmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    assessmentService.deleteAssessment(deleteAssessmentId);
                    System.out.println("Assessment deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Assessments:");
                    for (Assessment a : assessmentService.getAllAssessments()) {
                        System.out.println(a);
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

    // Result Management
    private static void manageResults(Scanner scanner, ResultIntf resultService) {
        int choice = -1;

        while (choice != 0) {
            System.out.println("Result Management");
            System.out.println("1. Add Result");
            System.out.println("2. Update Result");
            System.out.println("3. Delete Result");
            System.out.println("4. List Results");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Result ID: ");
                    int resultId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Assessment ID: ");
                    int assessmentId = scanner.nextInt();
                    System.out.print("Enter User ID: ");
                    int userId = scanner.nextInt();
                    System.out.print("Enter Score: ");
                    int score = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Result result = new Result(resultId, assessmentId, userId, score);
                    resultService.addResult(result);
                    System.out.println("Result added successfully.");
                    break;
                case 3:
                    System.out.print("Enter Result ID to delete: ");
                    int deleteResultId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    resultService.deleteResult(deleteResultId);
                    System.out.println("Result deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Results:");
                    for (Result r : resultService.getAllResults()) {
                        System.out.println(r);
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
