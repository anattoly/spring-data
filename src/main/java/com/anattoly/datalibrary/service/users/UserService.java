package com.anattoly.datalibrary.service.users;

import com.anattoly.datalibrary.entity.security.User;
import com.anattoly.datalibrary.repository.user.UserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService, UserDetailsService {

    private final UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void addUser(User user) {
        userRepo.save(user);
    }

    @Override
    public void deleteByUsername(String username) {
        userRepo.deleteByUsername(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return userRepo.existsByUsername(username);
    }

    @Override
    public Optional<User> getByUserId(Long id) {
        return userRepo.getUserById(id).isPresent()
                ? userRepo.getUserById(id)
                : Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return userRepo.findByUsername(username).isPresent()
                ? userRepo.findByUsername(username)
                : Optional.empty();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userRepo.findByUsername(s).get();
    }
}
