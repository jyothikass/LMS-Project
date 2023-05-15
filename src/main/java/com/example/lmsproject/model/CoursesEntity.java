package com.example.lmsproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Cources")
public class CoursesEntity {
        @Id
        private int courseId;
        private String courseName;
        private String teacherId;
        private LocalDate startDate;
        private LocalDate endDate;

    }

