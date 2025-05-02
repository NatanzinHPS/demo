package com.natan.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.natan.demo.entity.User;
import com.natan.demo.model.request.UserRequest;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toEntity(final UserRequest request);
} 
