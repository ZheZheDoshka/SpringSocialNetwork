package com.zhe.spring_social_network.repository;

import com.zhe.spring_social_network.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public User findByUsername(String username);
}
