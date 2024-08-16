package com.lms.repository;

import com.lms.models.Enrollment;
import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository {
    private List<Enrollment> enrollments = new ArrayList<>();

    public void addEnrollment(Enrollment enrollment) {
        enrollments.add(enrollment);
    }

    public Enrollment getEnrollment(int enrollmentId) {
        return enrollments.stream()
                .filter(e -> e.getEnrollmentId() == enrollmentId)
                .findFirst()
                .orElse(null);
    }

    public List<Enrollment> getAllEnrollments() {
        return new ArrayList<>(enrollments);
    }

    public void updateEnrollment(int enrollmentId, Enrollment updatedEnrollment) {
        for (int i = 0; i < enrollments.size(); i++) {
            if (enrollments.get(i).getEnrollmentId() == enrollmentId) {
                enrollments.set(i, updatedEnrollment);
                break;
            }
        }
    }

    public void deleteEnrollment(int enrollmentId) {
        enrollments.removeIf(e -> e.getEnrollmentId() == enrollmentId);
    }
}
