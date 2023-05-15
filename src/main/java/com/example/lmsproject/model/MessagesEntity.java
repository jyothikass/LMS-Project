package com.example.lmsproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "message")
public class MessagesEntity {
    @Id
    private int msgId;

    @ManyToOne
    @JoinColumn(name = "senderId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "receiverId")
    private User users;

    private  String content;

    private Timestamp timestamp;
}

