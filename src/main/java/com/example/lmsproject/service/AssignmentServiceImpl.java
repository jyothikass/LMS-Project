package com.example.lmsproject.service;

import com.example.lmsproject.model.AssignmentEntity;
import com.example.lmsproject.model.EnrollmentEntity;
import com.example.lmsproject.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService{
   @Autowired
    AssignmentRepository assignmentRepository;

    @Override
    public List<AssignmentEntity> getAllAssignment() {
        List<AssignmentEntity> assignments =assignmentRepository.findAll();
        return assignments;
    }

    @Override
    public AssignmentEntity save(AssignmentEntity assignmentEntity) {
        AssignmentEntity a=this.assignmentRepository.save(assignmentEntity);
        return a;
    }
}
