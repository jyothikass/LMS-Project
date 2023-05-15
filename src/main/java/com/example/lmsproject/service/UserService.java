package com.example.lmsproject.service;


import com.example.lmsproject.dto.UserDto;
import com.example.lmsproject.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    List<User> getAll();
    User save(User user);

    default UserDto findById(int id) {
        return null;

    }


    }

