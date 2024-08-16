package com.lms.service;

import com.lms.impl.AssessmentImpl;
import com.lms.intf.AssessmentIntf;
import com.lms.models.Assessment;
import java.util.List;
import java.util.Scanner;

public class AssessmentService {
    private AssessmentIntf assessmentIntf;

    public AssessmentService() {
        this.assessmentIntf = new AssessmentImpl();
    }

    public void addAssessment(Assessment assessment) {
        assessmentIntf.addAssessment(assessment);
    }

    public void updateAssessment(int assessmentId, Assessment updatedAssessment) {
        assessmentIntf.updateAssessment(assessmentId, updatedAssessment);
    }

    public void deleteAssessment(int assessmentId) {
        assessmentIntf.deleteAssessment(assessmentId);
    }

    public List<Assessment> getAllAssessments() {
        return assessmentIntf.getAllAssessments();
    }

    public void manageAssessments(Scanner scanner) {
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
                    addAssessment(assessment);
                    System.out.println("Assessment added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Assessment ID to update: ");
                    int updateAssessmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Course ID: ");
                    int newCourseId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Assessment Name: ");
                    String newAssessmentName = scanner.nextLine();
                    System.out.print("Enter new Assessment Date (YYYY-MM-DD): ");
                    String newAssessmentDate = scanner.nextLine();
                    System.out.print("Enter new Max Score: ");
                    int newMaxScore = scanner.nextInt();
                    Assessment updatedAssessment = new Assessment(updateAssessmentId, newCourseId, newAssessmentName, newAssessmentDate, newMaxScore);
                    updateAssessment(updateAssessmentId, updatedAssessment);
                    System.out.println("Assessment updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter Assessment ID to delete: ");
                    int deleteAssessmentId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deleteAssessment(deleteAssessmentId);
                    System.out.println("Assessment deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Assessments:");
                    for (Assessment a : getAllAssessments()) {
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
}
