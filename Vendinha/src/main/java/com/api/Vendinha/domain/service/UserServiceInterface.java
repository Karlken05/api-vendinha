package com.api.Vendinha.domain.service;


import com.api.Vendinha.domain.dto.UserRequestDto;
import com.api.Vendinha.domain.dto.UserResponseDto;

interface UserServiceInterface {
    UserResponseDto save(UserRequestDto userRequestDto);
}