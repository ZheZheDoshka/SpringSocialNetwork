package com.zhe.spring_social_network.service.implementation;

import com.zhe.spring_social_network.model.entities.UserProfile;
import com.zhe.spring_social_network.repository.UserProfileRepository;
import com.zhe.spring_social_network.repository.UserRepository;
import com.zhe.spring_social_network.service.UserProfileService;
import com.zhe.spring_social_network.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserProfileServiceImpl implements UserProfileService {

    @Autowired
    UserProfileRepository profileRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public UserProfile findByUsername(String username) {
        return profileRepository.findByUser(userRepository.findByUsername(username));
    }
}
