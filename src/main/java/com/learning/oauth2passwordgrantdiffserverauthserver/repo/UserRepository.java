package com.learning.oauth2passwordgrantdiffserverauthserver.repo;

import com.learning.oauth2passwordgrantdiffserverauthserver.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
}
