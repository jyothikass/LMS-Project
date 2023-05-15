package com.example.lmsproject.repository;


import com.example.lmsproject.model.ClassesEntity;
import com.example.lmsproject.model.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassesRepository extends JpaRepository<ClassesEntity,Integer> {
    }

