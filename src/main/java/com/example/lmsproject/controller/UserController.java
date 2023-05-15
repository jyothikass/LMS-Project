package com.example.lmsproject.controller;

import com.example.lmsproject.dto.UserDto;
import com.example.lmsproject.model.User;
import com.example.lmsproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAll(){
        return  userService.getAll();
    }

    @PostMapping("/addUser")
    public String saveUsers(@Validated @RequestBody User user){
        this.userService.save(user);
        return "Register";
    }
    @GetMapping("/findById/{id}")
    public UserDto onFindById(@PathVariable int id) {
        UserDto dto= this.userService.findById(id);
        return dto;
    }

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }

}