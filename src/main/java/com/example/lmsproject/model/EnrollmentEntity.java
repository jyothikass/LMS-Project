package com.example.lmsproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Enrollment")
public class EnrollmentEntity {
    @Id
    private int enrollId;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private CoursesEntity course;
}
