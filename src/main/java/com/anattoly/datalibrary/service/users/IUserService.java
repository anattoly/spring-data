package com.anattoly.datalibrary.service.users;

import com.anattoly.datalibrary.entity.security.User;

import java.util.Optional;

public interface IUserService {

    void saveUser(User user);

    void deleteByUsername(String username);

    boolean existsByUsername(String username);

    Optional<User> getByUserId(Long id);

    Optional<User> findByUsername(String username);
}
