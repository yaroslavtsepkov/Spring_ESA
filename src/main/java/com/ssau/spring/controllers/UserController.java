package com.ssau.spring.controllers;

import com.ssau.spring.UserRepository;
import com.ssau.spring.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String main(Model model){
        Iterable<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users.html";
    }
}
