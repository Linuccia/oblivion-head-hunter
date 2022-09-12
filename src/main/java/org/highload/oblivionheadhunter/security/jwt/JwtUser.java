package org.highload.oblivionheadhunter.security.jwt;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalTime;
import java.util.Collection;
import java.util.Date;

public class JwtUser implements UserDetails {
    private final String username;
    private final String password;
    private final boolean enabled;
    private final LocalTime lastPasswordResetDate;
    private final String[] roles;


    public JwtUser(String username, String password, boolean enabled, LocalTime lastPasswordResetDate, String[] roles) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.lastPasswordResetDate = lastPasswordResetDate;
        this.roles = roles;
    }

    public String[] getRoles(){
        return roles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public LocalTime getLastPasswordResetDate(){
        return lastPasswordResetDate;
    }
}
