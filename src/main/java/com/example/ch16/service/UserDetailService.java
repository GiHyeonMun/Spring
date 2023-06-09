package com.example.ch16.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailService {
    UserDetails loadUserByUserName(String username) throws UsernameNotFoundException;

    UserDetails loadUserByUsername(String username);
}
