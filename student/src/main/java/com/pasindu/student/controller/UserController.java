package com.pasindu.student.controller;

import com.pasindu.student.dto.UserDto;
import com.pasindu.student.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/vi/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveuser")
    private UserDto SaveUser(@RequestBody UserDto userDto)
    {
        return userService.saveuser(userDto);
    }

    @GetMapping("getallusers")
    private List<UserDto> getallusers(){
        return userService.getallusers();
    }


}
