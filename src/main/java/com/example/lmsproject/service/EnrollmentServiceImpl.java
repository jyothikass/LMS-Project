package com.example.lmsproject.service;

import com.example.lmsproject.model.EnrollmentEntity;
import com.example.lmsproject.repository.EnrollmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnrollmentServiceImpl implements EnrollmentService {
    @Autowired
    EnrollmentRepository enrollmentRepository;


    @Override
    public List<EnrollmentEntity> getAllEnroll() {
        List<EnrollmentEntity> enrollments =enrollmentRepository.findAll();
        return enrollments;
    }

    @Override
    public EnrollmentEntity save(EnrollmentEntity enrollmentEntity) {
        EnrollmentEntity e=this.enrollmentRepository.save(enrollmentEntity);
        return e;
    }

}