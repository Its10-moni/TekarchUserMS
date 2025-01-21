package com.example.TekarchUserMS.Models;

import lombok.Data;

@Data
public class User {
    private Long userId;
    private String username;
    private String email;
    private String phone;
}
