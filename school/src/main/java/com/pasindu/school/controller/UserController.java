package com.pasindu.school.controller;

import com.pasindu.school.dto.UserDto;
import com.pasindu.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vi/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PutMapping("/updateuser")
    private UserDto updateuser(@RequestBody UserDto userDto)
    {
        return userService.updateuser(userDto);
    }

    @DeleteMapping("/deleteuser")
    private UserDto deleteuser(@RequestBody UserDto userDto)
    {
        return userService.deleteuser(userDto);
    }
}
