package org.highload.oblivionheadhunter.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.highload.oblivionheadhunter.model.entity.User;
import org.highload.oblivionheadhunter.repository.UserRepository;
import org.highload.oblivionheadhunter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User register(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); //сохраняем пароль в зашифрованном виде
        user.setRoles(user.getRoles());

        User registeredUser = userRepository.save(user);

        log.info("In register - user: {} successfully registered" , registeredUser);

        return registeredUser;
    }

    @Override
    public List<User> getAll() {
        List<User> result = userRepository.findAll();
        log.info("In getAll - {} users found", result.size());
        return result;
    }

    @Override
    public User findByUsername(String username) {
        User result = userRepository.findByUsername(username);
        log.info("In findByUsername - user: {} found by username: {}", result, username);


        return result;
    }

    @Override
    public User findById(String username) {
        User result = userRepository.findById(username).orElse(null);

        if (result == null){
            log.warn("In FindById - no user found by id: {}", username);
            return null;
        }

        log.info("In findById - user: {} found by id: {}" , result , username);
        return result;
    }
}
