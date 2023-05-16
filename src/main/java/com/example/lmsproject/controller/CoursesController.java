package com.example.lmsproject.controller;

import com.example.lmsproject.dto.CourcesDto;
import com.example.lmsproject.model.CoursesEntity;
import com.example.lmsproject.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {
    @Autowired
     private CoursesService coursesService;


    @GetMapping("/getAllCourse")
    List<CoursesEntity> getCourses() {
        List<CoursesEntity> courses = coursesService.getAll();
        return courses;
    }

    @PostMapping("/addCource")
    public String saveCource(@Validated @RequestBody CoursesEntity courses) {
        this.coursesService.save(courses);
        return "Register";
    }

    @GetMapping("/test")
    public String test() {
        return "in user controller";
    }
    @GetMapping("/findByCourseName/{courseName}")
    public CoursesEntity findByCourseName(@PathVariable String courseName){
        CoursesEntity course=coursesService.findByCourseName(courseName);
        return course;
    }

//        @GetMapping("/deleteById/{id}")
//        public CourcesDto onDeleteById(@PathVariable int id){
//            CourcesDto courcesDto = this.coursesService.deleteById(id);
//            return courcesDto;
//        //        }




}


