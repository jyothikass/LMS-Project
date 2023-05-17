package com.example.lmsproject.model;


import com.example.lmsproject.enumm.UserRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="Users")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        private String username;
        private String password;
        @Enumerated(EnumType.STRING)
        private UserRole role;

}
