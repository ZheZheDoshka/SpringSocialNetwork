package com.zhe.spring_social_network.repository;

import com.zhe.spring_social_network.model.entities.User;
import com.zhe.spring_social_network.model.entities.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {


    public UserProfile findByUser(User user);
}
