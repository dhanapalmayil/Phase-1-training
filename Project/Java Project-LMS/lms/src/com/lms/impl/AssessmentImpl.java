package com.lms.impl;

import com.lms.intf.AssessmentIntf;
import com.lms.models.Assessment;
import java.util.ArrayList;
import java.util.List;

public class AssessmentImpl implements AssessmentIntf {
    private List<Assessment> assessments = new ArrayList<>();

    @Override
    public void addAssessment(Assessment assessment) {
        assessments.add(assessment);
    }

    @Override
    public Assessment getAssessment(int assessmentId) {
        return assessments.stream().filter(a -> a.getId() == assessmentId).findFirst().orElse(null);
    }

    @Override
    public List<Assessment> getAllAssessments() {
        return assessments;
    }

    
   
    @Override
    public void deleteAssessment(int assessmentId) {
        assessments.removeIf(a -> a.getId() == assessmentId);
    }

	@Override
	public void updateAssessment(int updateAssessmentId, Assessment assessment) {
		// TODO Auto-generated method stub
		
	}
}
