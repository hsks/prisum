package com.hsks.rembotate.controller;

import com.hsks.rembotate.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    @ResponseBody
    public List<User> getUsers() {
    return Collections.singletonList(new User("harsh", "hsks@hsks.in"));
    }
}
