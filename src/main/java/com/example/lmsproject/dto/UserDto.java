package com.example.lmsproject.dto;

import com.example.lmsproject.enumm.UserRole;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Data
public class UserDto {
	private Integer id;
	private String username;
	private String password;
	@Enumerated(EnumType.STRING)
	private UserRole role;

}
