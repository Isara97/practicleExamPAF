package com.rst.boot.repositories;

import com.rst.boot.domain.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDTO, Integer> {
    // get all users
    // find by id
    // delete
    // update
    // custom query


}
