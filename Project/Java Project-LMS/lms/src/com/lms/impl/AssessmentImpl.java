package com.lms.impl;

import com.lms.intf.AssessmentIntf;
import com.lms.models.Assessment;
import com.lms.repository.AssessmentRepository;

import java.util.List;

public class AssessmentImpl implements AssessmentIntf {
	 private AssessmentRepository assessmentRepository;

	    public AssessmentImpl() {
	        this.assessmentRepository = new AssessmentRepository();
	    }

    @Override
    public void addAssessment(Assessment assessment) {
    	assessmentRepository.addAssessment(assessment);
    }

    @Override
    public List<Assessment> getAllAssessments() {
        return assessmentRepository.getAllAssessments();
    }

    @Override
    public void updateAssessment(int assessmentId, Assessment assessment) {
    	assessmentRepository.updateAssessment(assessmentId, assessment);
    }

    @Override
    public void deleteAssessment(int assessmentId) {
    	assessmentRepository.deleteAssessment(assessmentId);
    }
}
