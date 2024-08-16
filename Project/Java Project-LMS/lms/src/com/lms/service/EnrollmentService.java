package com.lms.service;

import com.lms.models.Enrollment;
import com.lms.repository.EnrollmentRepository;
import java.util.List;
import com.lms.intf.*;
public class EnrollmentService implements EnrollmentIntf {
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

	@Override
	public Enrollment getEnrollment(int enrollmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEnrollment(Enrollment enrollment) {
		// TODO Auto-generated method stub
		
	}
}
