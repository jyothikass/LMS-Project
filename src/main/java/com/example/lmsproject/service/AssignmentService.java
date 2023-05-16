package com.example.lmsproject.service;

import com.example.lmsproject.model.AssignmentEntity;
import com.example.lmsproject.model.EnrollmentEntity;

import java.util.List;

public interface AssignmentService {
    List<AssignmentEntity> getAllAssignment();

    AssignmentEntity save(AssignmentEntity assignmentEntity);
}
