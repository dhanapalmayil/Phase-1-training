package com.lms.service;

import com.lms.models.Assessment;
import com.lms.repository.AssessmentRepository;
import java.util.List;

public class AssessmentService {
    private AssessmentRepository assessmentRepository;

    public AssessmentService() {
        this.assessmentRepository = new AssessmentRepository();
    }

    public void addAssessment(Assessment assessment) {
        assessmentRepository.addAssessment(assessment);
    }

   
    public void deleteAssessment(int assessmentId) {
        assessmentRepository.deleteAssessment(assessmentId);
    }

    public List<Assessment> getAllAssessments() {
        return assessmentRepository.getAllAssessments();
    }
}
