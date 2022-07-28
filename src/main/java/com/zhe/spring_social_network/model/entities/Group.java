package com.zhe.spring_social_network.model.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    Long id;
    String group_name;
    String identificator;
    User group_owner;
}
