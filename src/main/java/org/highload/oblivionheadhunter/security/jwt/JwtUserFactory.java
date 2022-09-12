package org.highload.oblivionheadhunter.security.jwt;

import org.highload.oblivionheadhunter.model.entity.User;

import static java.time.LocalTime.now;

public final class JwtUserFactory {

    public JwtUserFactory(){
    }

    public static JwtUser create(User user){
        return new JwtUser(user.getUsername(),
                user.getPassword(),
                true,
                now(),
                user.getRoles());
    }
}