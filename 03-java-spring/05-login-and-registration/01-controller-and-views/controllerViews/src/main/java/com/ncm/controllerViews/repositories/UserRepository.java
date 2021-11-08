package com.ncm.controllerViews.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ncm.controllerViews.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByEmail(String email);
}