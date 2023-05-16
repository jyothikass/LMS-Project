package com.example.lmsproject.controller;

import com.example.lmsproject.model.EnrollmentEntity;
import com.example.lmsproject.service.EnrollmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnrollmentController {

    @Autowired
    private EnrollmentService enrollmentService;

    @GetMapping("/getAllEnroll")
    public List<EnrollmentEntity> getAllEnroll() {
        List<EnrollmentEntity> enrollments=enrollmentService.getAllEnroll();
        return enrollments;
    }

    @PostMapping("/addEnroll")
    public EnrollmentEntity save(@Validated @RequestBody EnrollmentEntity enrollment){
        EnrollmentEntity e=enrollmentService.save(enrollment);
        return e;
    }
}
