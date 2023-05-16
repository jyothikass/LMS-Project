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
    @GeneratedValue(generator = "x")
    @SequenceGenerator(name = "x",sequenceName = "x",initialValue = 1111,allocationSize = 1)
    private int enrollId;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private User user;

    private String studentName;

    @ManyToOne
    @JoinColumn(name = "courseId")
    private CoursesEntity course;
}
