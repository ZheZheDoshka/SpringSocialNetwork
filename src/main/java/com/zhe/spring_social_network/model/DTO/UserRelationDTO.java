package com.zhe.spring_social_network.model.DTO;

import com.zhe.spring_social_network.model.entities.User;
import com.zhe.spring_social_network.model.enums.UserRelations;

public class UserRelationDTO {

    Long id;
    User requester;
    User requestee;
    UserRelations relation;
}
