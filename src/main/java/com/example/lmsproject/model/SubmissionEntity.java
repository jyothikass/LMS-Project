package com.example.lmsproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.ast.tree.update.Assignment;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "submission")
public class SubmissionEntity {
    @Id
    @GeneratedValue(generator = "x")
    @SequenceGenerator(name = "x",sequenceName = "x",initialValue = 11,allocationSize = 1)
    private int id;

    @ManyToOne
    @JoinColumn(name = "studentName")
    private User user;

    @ManyToOne
    @JoinColumn(name = "assignId")
    private AssignmentEntity assignment;

    private int grade;

    private String feedback;
}
