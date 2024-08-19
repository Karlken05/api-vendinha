package com.api.Vendinha.domain.service;

import com.api.Vendinha.domain.dto.UserRequestDto;
import com.api.Vendinha.domain.dto.UserResponseDto;
import com.api.Vendinha.domain.entity.User;
import com.api.Vendinha.domain.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceInterface {
    public UserRepository userRepository;
    @Override
    public UserResponseDto save(UserRequestDto userRequestDto) {
        User user = new User();
        user.setNome(userRequestDto.nome);
        this.userRepository.save(user);

        return new UserResponseDto(
                user.getId(),
                user.getNome()
        );
    }
}
