package com.zhe.spring_social_network.model.DTO;

import com.zhe.spring_social_network.model.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserProfileDTO {

    Long id;
    User user;
    String description;
    String photo;
    String poststory;
}
