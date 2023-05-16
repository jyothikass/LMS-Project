package com.example.lmsproject.repository;

import com.example.lmsproject.model.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<CoursesEntity,Integer> {
public CoursesEntity findByCourseName(String courseName);
}
