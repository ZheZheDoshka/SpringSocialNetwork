package com.zhe.spring_social_network.service.implementation;

import com.zhe.spring_social_network.model.entities.User;
import com.zhe.spring_social_network.model.enums.Role;
import com.zhe.spring_social_network.repository.UserRepository;
import com.zhe.spring_social_network.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UserRepository userRepository;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        userRepository.save(user);
    }
}
