package com.lms.service;

import com.lms.models.Enrollment;
import com.lms.repository.EnrollmentRepository;
import java.util.List;

public class EnrollmentService {
    private EnrollmentRepository enrollmentRepository;

    public EnrollmentService() {
        this.enrollmentRepository = new EnrollmentRepository();
    }

    public void addEnrollment(Enrollment enrollment) {
        enrollmentRepository.addEnrollment(enrollment);
    }

    public void updateEnrollment(int enrollmentId, Enrollment updatedEnrollment) {
        enrollmentRepository.updateEnrollment(enrollmentId, updatedEnrollment);
    }

    public void deleteEnrollment(int enrollmentId) {
        enrollmentRepository.deleteEnrollment(enrollmentId);
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollmentRepository.getAllEnrollments();
    }
}
