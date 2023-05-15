package com.example.lmsproject.service;

import com.example.lmsproject.dto.CourcesDto;
import com.example.lmsproject.dto.UserDto;
import com.example.lmsproject.model.CoursesEntity;
import com.example.lmsproject.model.User;
import com.example.lmsproject.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class CoursesServiceImpl implements CoursesService {
    @Autowired
    CoursesRepository coursesRepository;

    @Override
    public List<CoursesEntity> getAll() {
        List<CoursesEntity> courses=coursesRepository.findAll();
        return courses;
    }
    @Override
    public CoursesEntity save(CoursesEntity course){
        CoursesEntity c=coursesRepository.save(course);
        return c;
    }

//    @Override
//    public CourcesDto deleteById(int id) {
//        CoursesEntity entity = this.coursesRepository.deleteById(id);
//        CourcesDto dto = new CourcesDto();
//       dto.setCourseId(entity.getCourseId());
//       dto.setTeacherId(entity.getTeacherId());
//       dto.setCourseName(entity.getCourseName());
//       dto.setStartDate(entity.getStartDate());
//       dto.setEndDate(entity.getEndDate());
//        return dto;
//    }

    @Override
    public Collection<?> getCoursesByname(String courseNam) {
        this.getCoursesByname(courseNam);
        return null;
    }
}

