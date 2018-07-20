package com.gang.demo.springcloundprivider.controller;

import com.gang.demo.springcloundprivider.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable Long id){

        UserDto userDto = new UserDto();
        userDto.setId(id);
        userDto.setUserName("test");
        return userDto;
    }
}
