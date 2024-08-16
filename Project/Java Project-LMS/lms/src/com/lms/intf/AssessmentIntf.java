package com.lms.intf;

import com.lms.models.Assessment;
import java.util.List;

public interface AssessmentIntf {
    void addAssessment(Assessment assessment);
    Assessment getAssessment(int assessmentId);
    List<Assessment> getAllAssessments();
    void updateAssessment(int updateAssessmentId, Assessment assessment);
    void deleteAssessment(int assessmentId);
}
