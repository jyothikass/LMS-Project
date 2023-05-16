package com.example.lmsproject.controller;

import com.example.lmsproject.model.AssignmentEntity;
import com.example.lmsproject.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AssignmentController {
    @Autowired
    private AssignmentService assignmentService;

    @GetMapping("/getAllAssignments")
   List<AssignmentEntity> getAllAssignments() {
        List<AssignmentEntity> assignments=assignmentService.getAllAssignment();
        return assignments;
    }

    @PostMapping("/addAssignments")
    public AssignmentEntity save(@Validated @RequestBody AssignmentEntity assignment){
        AssignmentEntity a=assignmentService.save(assignment);
        return a;
    }
}
