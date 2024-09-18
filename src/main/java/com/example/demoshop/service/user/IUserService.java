package com.example.demoshop.service.user;

import com.example.demoshop.dto.UserDto;
import com.example.demoshop.model.User;
import com.example.demoshop.request.CreateUserRequest;
import com.example.demoshop.request.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    UserDto convertUserToDto(User user);
}
