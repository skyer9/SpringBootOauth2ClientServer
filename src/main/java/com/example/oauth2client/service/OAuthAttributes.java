package com.example.oauth2client.service;

import com.example.oauth2client.domain.Role;
import com.example.oauth2client.domain.User;
import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
public class OAuthAttributes {
    private Map<String, Object> attributes;
    private String nameAttributeKey;
    private String username;
    private String email;
    private String picture;

    @Builder
    public OAuthAttributes(Map<String, Object> attributes,
                           String nameAttributeKey, String username,
                           String email, String picture) {
        this.attributes = attributes;
        this.nameAttributeKey = nameAttributeKey;
        this.username = username;
        this.email = email;
        this.picture = picture;
    }

    public static OAuthAttributes of(String registrationId, String userNameAttributeName, Map<String, Object> attributes) {

        return OAuthAttributes.builder()
                .username((String) attributes.get("name"))
                .email((String) attributes.get("email"))
                .picture((String) attributes.get("picture"))
                .attributes(attributes)
                .nameAttributeKey(userNameAttributeName)
                .build();
    }

    public User toEntity() {
        return User.builder()
                .username(username)
                .email(email)
                .picture(picture)
                .role(Role.GUEST)
                .build();
    }
}
