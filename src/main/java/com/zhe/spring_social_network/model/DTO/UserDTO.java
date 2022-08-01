package com.zhe.spring_social_network.model.DTO;

import com.zhe.spring_social_network.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    Long id;
    String username;
    String password;
    String identificator;
    String firstname;
    String lastname;
    String email;
    Role role;
}
