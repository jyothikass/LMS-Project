package com.example.lmsproject.repository;

import com.example.lmsproject.model.MessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessagesRepository extends JpaRepository<MessagesEntity,Integer> {
}
