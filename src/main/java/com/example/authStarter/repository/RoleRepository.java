package com.example.authStarter.repository;

import com.example.authStarter.models.ERole;
import com.example.authStarter.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
