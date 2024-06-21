package com.workshop.library.utils.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.workshop.library.api.dto.request.UserRequest;
import com.workshop.library.api.dto.response.UserResponse;
import com.workshop.library.domain.entities.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse entityToResponse(User user);

    @Mapping(target = "loans", ignore = true)
    @Mapping(target = "reservations", ignore = true)
    User requestToEntity(UserRequest userRequest);

}
