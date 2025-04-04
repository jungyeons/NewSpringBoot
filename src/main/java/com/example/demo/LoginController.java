package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/login")
public class LoginController {

    @GetMapping
    public String showLogin() {
        return "login";
    }

    @PostMapping
    public String doLogin(@RequestParam String id, @RequestParam String pwd, Model model) {
        if ("asdf".equals(id) && "1234".equals(pwd)) {
            model.addAttribute("id", id);
            model.addAttribute("pwd", pwd);
            return "userInfo";
        }
        return "redirect:/login";
    }
}
