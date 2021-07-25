package com.example.oauth2client.web;

import com.example.oauth2client.config.LoginUser;
import com.example.oauth2client.config.SessionUserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final HttpSession httpSession;

    @GetMapping("/")
    public String index(Model model, @PageableDefault Pageable pageable, @LoginUser SessionUserDto user, @RequestParam Map<String, String> params) {

        if (user != null) {
            model.addAttribute("userName", user.getUsername());
        }

        return "index";
    }
}
