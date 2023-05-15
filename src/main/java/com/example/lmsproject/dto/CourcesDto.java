package com.example.lmsproject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourcesDto {
    private int courseId;
    private String courseName;
    private String teacherId;
    private LocalDate startDate;
    private LocalDate endDate;

}

