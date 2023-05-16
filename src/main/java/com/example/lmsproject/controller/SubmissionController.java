package com.example.lmsproject.controller;


import com.example.lmsproject.model.SubmissionEntity;
import com.example.lmsproject.service.SubmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubmissionController {
    @Autowired
    private SubmissionService submissionService;

    @GetMapping("/getAllgrades")
    public List<SubmissionEntity> getAllEnroll() {
        List<SubmissionEntity> submissions=submissionService.getAllSubmission();
        return submissions;
    }

    @PostMapping("/addGrade")
    public SubmissionEntity save(@Validated @RequestBody SubmissionEntity submission){
        SubmissionEntity e=submissionService.save(submission);
        return e;
    }
}
