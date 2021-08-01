package com.example.oauth2client.web.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String firstName;

    private String lastName;

    private String password;

    private String matchingPassword;

    private String email;

    private String roles;
}
