package com.pasindu.student.repository;

import com.pasindu.student.entity.UserEntity;
import com.pasindu.student.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
