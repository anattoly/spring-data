package com.anattoly.datalibrary.service.users;

import com.anattoly.datalibrary.entity.security.User;
import com.anattoly.datalibrary.repository.user.IUserRepo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements IUserService, UserDetailsService {

    private final IUserRepo IUserRepo;

    public UserService(IUserRepo IUserRepo) {
        this.IUserRepo = IUserRepo;
    }

    public void saveUser(User user) {
        IUserRepo.save(user);
    }

    @Override
    public void deleteByUsername(String username) {
        IUserRepo.deleteByUsername(username);
    }

    @Override
    public boolean existsByUsername(String username) {
        return IUserRepo.existsByUsername(username);
    }

    @Override
    public Optional<User> getByUserId(Long id) {
        return IUserRepo.getUserById(id).isPresent()
                ? IUserRepo.getUserById(id)
                : Optional.empty();
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return IUserRepo.findByUsername(username).isPresent()
                ? IUserRepo.findByUsername(username)
                : Optional.empty();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return IUserRepo.findByUsername(s).get();
    }
}
