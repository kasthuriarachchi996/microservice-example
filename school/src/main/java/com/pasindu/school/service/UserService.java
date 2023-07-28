package com.pasindu.school.service;

import com.pasindu.school.dto.UserDto;
import com.pasindu.school.entity.UserEntity;
import com.pasindu.school.repository.UserRepository;
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

    public UserDto updateuser(UserDto userDto)
    {
        userRepository.save(modelMapper.map(userDto , UserEntity.class));
        return userDto;
    }

    public UserDto deleteuser(UserDto userDto)
    {
        userRepository.delete(modelMapper.map(userDto , UserEntity.class));
        return userDto;
    }
}
