package com.lms.service;

import com.lms.impl.ResultImpl;
import com.lms.intf.ResultIntf;
import com.lms.models.Result;
import java.util.List;
import java.util.Scanner;

public class ResultService {
    private ResultIntf resultIntf;

    public ResultService() {
        this.resultIntf = new ResultImpl();
    }

    public void addResult(Result result) {
        resultIntf.addResult(result);
    }

    public void updateResult(int resultId, Result updatedResult) {
        resultIntf.updateResult(resultId, updatedResult);
    }

    public void deleteResult(int resultId) {
        resultIntf.deleteResult(resultId);
    }

    public List<Result> getAllResults() {
        return resultIntf.getAllResults();
    }

    public void manageResults(Scanner scanner) {
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
                    addResult(result);
                    System.out.println("Result added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Result ID to update: ");
                    int updateResultId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new Assessment ID: ");
                    int newAssessmentId = scanner.nextInt();
                    System.out.print("Enter new User ID: ");
                    int newUserId = scanner.nextInt();
                    System.out.print("Enter new Score: ");
                    int newScore = scanner.nextInt();
                    Result updatedResult = new Result(updateResultId, newAssessmentId, newUserId, newScore);
                    updateResult(updateResultId, updatedResult);
                    System.out.println("Result updated successfully.");
                    break;
                case 3:
                    System.out.print("Enter Result ID to delete: ");
                    int deleteResultId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    deleteResult(deleteResultId);
                    System.out.println("Result deleted successfully.");
                    break;
                case 4:
                    System.out.println("List of Results:");
                    for (Result r : getAllResults()) {
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
