package com.example.lmsproject.service;

import com.example.lmsproject.dto.UserDto;
import com.example.lmsproject.model.User;
import com.example.lmsproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        List<User> users = userRepository.findAll();
        return users;

    }

    @Override
    public User save(User user) {
        User user1 = userRepository.save(user);
        return user1;
    }

    @Override
    public UserDto findById(int id) {
        User entity = this.userRepository.findById(id).orElse(null);
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setUsername(entity.getUsername());
        dto.setPassword(entity.getPassword());
        dto.setRole(entity.getRole());
        return dto;
    }
//    @Override
//    public UserDto update(UserDto dto) {
//        UserDto user= userRepository.findById(dto.getId());
//        user.setUsername(dto.getUsername());
//        user.setPassword(dto.getPassword());
//        user.setRole(dto.getRole());
//}


}
