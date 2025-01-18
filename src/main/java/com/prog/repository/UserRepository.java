package com.prog.repository;

import com.prog.entity.UserDtls;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserDtls, String> {
    // Custom query methods (if needed) can be added here
}