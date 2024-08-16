package com.lms.intf;

import com.lms.models.Assessment;
import java.util.List;

public interface AssessmentIntf {
    void addAssessment(Assessment assessment);
    List<Assessment> getAllAssessments();
    void updateAssessment(int assessmentId, Assessment assessment);
    void deleteAssessment(int assessmentId);
}
