package com.example.oauth2client.config;

import com.example.oauth2client.domain.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUserDto implements Serializable {

    private String username;
    private String email;
    private String picture;

    public SessionUserDto(User user) {
        this.username = user.getUsername();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
