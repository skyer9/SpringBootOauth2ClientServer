package com.example.oauth2client.web;

import com.example.oauth2client.web.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequiredArgsConstructor
@Controller
@RequestMapping("/join")
public class JoinController {

    private final String PROFILE_SERVER = "http://profile.localhost:9002/user/join";

    private final HttpSession httpSession;

    @GetMapping("/user")
    public String join(Model model) {

        UserDto userDto = new UserDto();
        model.addAttribute("user", userDto);

        return "join/user";
    }
}
