package com.zhe.spring_social_network.service;

import com.zhe.spring_social_network.model.entities.UserProfile;

public interface UserProfileService {

    public UserProfile findByUsername(String username);
}
