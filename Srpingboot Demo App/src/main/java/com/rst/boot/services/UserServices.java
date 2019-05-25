package com.rst.boot.services;

import com.rst.boot.domain.UserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserServices {

    List<UserDTO> findAllUsers();

    String saveUser(UserDTO userData);

    String updateUser(UserDTO newUserData);

    UserDTO findById(Integer id);

    void delete(int id);

    String deleteUserById(Integer id);

    /*ResponseEntity<UserDTO> deleteUserById(Integer id);*/


}
