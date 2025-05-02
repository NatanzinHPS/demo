package com.natan.demo.service;

import org.springframework.stereotype.Service;

import com.natan.demo.entity.User;
import com.natan.demo.mapper.UserMapper;
import com.natan.demo.model.request.UserRequest;
import com.natan.demo.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserService {
    
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public Mono<User> save(final UserRequest request) {
        return userRepository.save(userMapper.toEntity(request));
    }
}
