package com.lms.intf;

import com.lms.models.Enrollment;
import java.util.List;

public interface EnrollmentIntf {
    void addEnrollment(Enrollment enrollment);
    Enrollment getEnrollment(int enrollmentId);
    List<Enrollment> getAllEnrollments();
    void updateEnrollment(Enrollment enrollment);
    void deleteEnrollment(int enrollmentId);
}
