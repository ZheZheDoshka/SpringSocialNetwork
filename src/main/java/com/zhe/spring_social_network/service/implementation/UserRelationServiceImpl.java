package com.zhe.spring_social_network.service.implementation;

import com.zhe.spring_social_network.model.entities.UserRelation;
import com.zhe.spring_social_network.model.enums.UserRelations;
import com.zhe.spring_social_network.repository.UserRelationRepository;
import com.zhe.spring_social_network.service.UserRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserRelationServiceImpl implements UserRelationService {

    @Autowired
    UserRelationRepository userRelationRepository;

    @Override
    public void addFriend(UserRelation userRelation) {
        userRelation.setRelation(UserRelations.PENDING);
    }

    @Override
    @Transactional
    public void acceptFriend(Long relationId) {
        userRelationRepository.changeUserRelation(relationId, UserRelations.FRIEND);
    }

    @Override
    public void removeFriend(Long relationId) {
        userRelationRepository.deleteById(relationId);
    }

    @Override
    public void blockUser(Long requesterId, Long requesteeId) {

    }
}
