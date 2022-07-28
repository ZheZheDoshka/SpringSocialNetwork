package com.zhe.spring_social_network.model.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER,
    ADMIN,
    MODERATOR;


    @Override
    public String getAuthority() {
            return name();
    }
}
