package com.example.lmsproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "assignmnet")
public class AssignmentEntity {
    @Id
    private  int assignId;

    private String assignName;

    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private CoursesEntity course;
}
