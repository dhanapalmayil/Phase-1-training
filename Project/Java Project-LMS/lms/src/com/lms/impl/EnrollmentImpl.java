package com.lms.impl;

import com.lms.intf.EnrollmentIntf;
import com.lms.models.Enrollment;
import com.lms.repository.EnrollmentRepository;

import java.util.List;

public class EnrollmentImpl implements EnrollmentIntf {
    private EnrollmentRepository enrollmentRepo = new EnrollmentRepository();

    @Override
    public void addEnrollment(Enrollment enrollment) {
        enrollmentRepo.addEnrollment(enrollment);
    }

    @Override
    public Enrollment getEnrollment(int enrollmentId) {
        return enrollmentRepo.getEnrollment(enrollmentId);
    }

    @Override
    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepo.getAllEnrollments();
    }

    @Override
    public void updateEnrollment(int enrollmentId, Enrollment enrollment) {
        enrollmentRepo.updateEnrollment(enrollment.getEnrollmentId(), enrollment);
    }

    @Override
    public void deleteEnrollment(int enrollmentId) {
        enrollmentRepo.deleteEnrollment(enrollmentId);
    }
}
