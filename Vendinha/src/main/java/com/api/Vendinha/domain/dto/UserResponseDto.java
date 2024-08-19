package com.api.Vendinha.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class UserResponseDto {
    public Integer id;
    public String name;

    public UserResponseDto(Integer id, String nome) {
        this.id = id;
        this.name = nome;
    }
}