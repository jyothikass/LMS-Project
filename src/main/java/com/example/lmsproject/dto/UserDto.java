package com.example.lmsproject.dto;

import com.example.lmsproject.enumm.UserRole;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

}
