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
    private int subId;

    private String grade;

    private String feedback;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "assignId")
    private AssignmentEntity assignment;
}
