package com.api.Vendinha.domain.repository;

import com.api.Vendinha.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
