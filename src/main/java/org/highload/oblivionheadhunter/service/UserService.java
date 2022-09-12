package org.highload.oblivionheadhunter.service;


import org.highload.oblivionheadhunter.model.entity.User;
import java.util.List;

public interface UserService {


    User register(User user);

    List<User> getAll();

    User findByUsername(String username);

    User findById(String username);

}