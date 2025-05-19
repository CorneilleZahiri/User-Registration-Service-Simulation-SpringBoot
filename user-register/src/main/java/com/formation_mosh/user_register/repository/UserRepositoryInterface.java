package com.formation_mosh.user_register.repository;

import com.formation_mosh.user_register.entity.User;

public interface UserRepositoryInterface {
    void save(User user);

    User findByEmail(String email);
}
