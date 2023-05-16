package com.example.lmsproject.service;

import com.example.lmsproject.model.EnrollmentEntity;
import com.example.lmsproject.model.SubmissionEntity;
import com.example.lmsproject.repository.EnrollmentRepository;
import com.example.lmsproject.repository.SubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionServiceImpl implements SubmissionService{
    @Autowired
    SubmissionRepository submissionRepository;

    @Override
    public List<SubmissionEntity> getAllSubmission() {
        List<SubmissionEntity> submissions =submissionRepository.findAll();
        return submissions;
    }

    @Override
    public SubmissionEntity save(SubmissionEntity submissionEntity) {
        SubmissionEntity s=this.submissionRepository.save(submissionEntity);
        return s;
    }
}
