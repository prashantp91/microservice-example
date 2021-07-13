package com.example.user.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.user.entity.User;

public interface UserRepository extends MongoRepository<User, String>{

}
