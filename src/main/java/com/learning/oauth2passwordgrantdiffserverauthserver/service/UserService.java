package com.learning.oauth2passwordgrantdiffserverauthserver.service;

import com.learning.oauth2passwordgrantdiffserverauthserver.model.User;

import java.util.List;

public interface UserService {
    
    List<User> findAll();
    
    void delete(Long id);
    
    User save(User user); 
}
