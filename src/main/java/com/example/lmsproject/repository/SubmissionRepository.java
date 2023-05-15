package com.example.lmsproject.repository;


import com.example.lmsproject.model.SubmissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissionRepository extends JpaRepository<SubmissionEntity,Integer> {
}
