package com.example.lmsproject.service;

import com.example.lmsproject.model.EnrollmentEntity;

import java.util.List;

public interface EnrollmentService {
    List<EnrollmentEntity> getAllEnroll();

    EnrollmentEntity save(EnrollmentEntity enrollmentEntity);
}
