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
public class GroupDTO {
    Long id;
    String groupname;
    String group_display_name;
    User group_owner;
}
