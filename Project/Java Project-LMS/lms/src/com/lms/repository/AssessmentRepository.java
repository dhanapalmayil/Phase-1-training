package com.lms.repository;

import com.lms.models.Assessment;

import java.util.ArrayList;
import java.util.List;

public class AssessmentRepository {
    private List<Assessment> assessments = new ArrayList<>();

    // Add sample data
    public AssessmentRepository() {
        // Adding some sample assessments
        assessments.add(new Assessment(1, 1, "Python Basics Quiz", "2024-11-15", 100));
        assessments.add(new Assessment(2, 2, "JavaScript Project", "2024-12-01", 150));
        assessments.add(new Assessment(3, 3, "Java Fundamentals Test", "2024-10-15", 120));
        assessments.add(new Assessment(4, 4, "Ruby on Rails Assignment", "2024-12-15", 200));
    }

    public void addAssessment(Assessment assessment) {
        assessments.add(assessment);
    }

    public void updateAssessment(int assessmentId, Assessment updatedAssessment) {
        for (int i = 0; i < assessments.size(); i++) {
            if (assessments.get(i).getId() == assessmentId) {
                assessments.set(i, updatedAssessment);
                break;
            }
        }
    }

    public void deleteAssessment(int assessmentId) {
        assessments.removeIf(assessment -> assessment.getId() == assessmentId);
    }

    public List<Assessment> getAllAssessments() {
        return new ArrayList<>(assessments);
    }
}
