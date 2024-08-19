package com.api.Vendinha.controller;

import com.api.Vendinha.domain.dto.UserRequestDto;
import com.api.Vendinha.domain.entity.User;
import com.api.Vendinha.domain.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    public UserServiceInterface userServiceInterface;

    @PostMapping("/user")
    public User save(@RequestBody UserRequestDto userRequestDto){
        return this.userServiceInterface.save(userRequestDto);
    }
}