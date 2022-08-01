package com.zhe.spring_social_network.service;

import com.zhe.spring_social_network.model.entities.UserRelation;

public interface UserRelationService {

    void addFriend(UserRelation userRelation);

    void acceptFriend(Long relationId);

    void removeFriend(Long relationId);

    void blockUser(Long requesterId, Long requesteeId);
}
