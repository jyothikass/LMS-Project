package com.example.lmsproject.repository;

import com.example.lmsproject.model.CoursesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesRepository extends JpaRepository<CoursesEntity,Integer> {
    List<CoursesEntity> getUserByname(String courseName);
}
