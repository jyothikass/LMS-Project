package com.example.lmsproject.service;

import com.example.lmsproject.dto.CourcesDto;
import com.example.lmsproject.dto.UserDto;
import com.example.lmsproject.model.CoursesEntity;

import java.util.Collection;
import java.util.List;

public interface CoursesService {
    List<CoursesEntity> getAll();

    CoursesEntity save(CoursesEntity course);

    default CourcesDto deleteById(int id) {
        return null;

    }

    Collection<?> getCoursesByname(String courseNam);
}
