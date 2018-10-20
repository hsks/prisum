package com.hsks.prisum.repository;

import com.hsks.prisum.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, String> {
    List<User> findByName(String name);

    List<User> findAll();
}
