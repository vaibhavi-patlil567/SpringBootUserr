package com.example.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
