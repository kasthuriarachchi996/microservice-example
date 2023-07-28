package com.pasindu.student.service;

import com.pasindu.student.dto.UserDto;
import com.pasindu.student.entity.UserEntity;
import com.pasindu.student.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    public UserDto saveuser(UserDto userDto)
    {
        userRepository.save(modelMapper.map(userDto , UserEntity.class));
        return userDto;
    }

    public List<UserDto> getallusers(){
        List<UserEntity>userList=userRepository.findAll();
        return modelMapper.map(userList ,new TypeToken<List<UserDto>>(){}.getType());

    }

}
