package com.anattoly.datalibrary.controller;

import com.anattoly.datalibrary.entity.security.User;
import com.anattoly.datalibrary.service.users.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SecurityController {

    private final UserService userService;

    public SecurityController(UserService userRepo) {
        this.userService = userRepo;
    }

    @PostMapping("/registration")
    public ResponseEntity<User> registrationUser(@RequestBody User user) {
        userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
