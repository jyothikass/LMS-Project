package com.example.lmsproject.service;

import com.example.lmsproject.model.EnrollmentEntity;
import com.example.lmsproject.model.SubmissionEntity;

import java.util.List;

public interface SubmissionService {
    List<SubmissionEntity> getAllSubmission();

    SubmissionEntity save(SubmissionEntity submissionEntity);
}
