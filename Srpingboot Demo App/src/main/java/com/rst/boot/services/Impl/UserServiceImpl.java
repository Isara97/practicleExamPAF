package com.rst.boot.services.Impl;

import com.rst.boot.domain.UserDTO;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> findAllUsers() {
        List<UserDTO> allUsers = userRepository.findAll();
        return allUsers;
    }

    @Override
    public String saveUser(UserDTO userData) {
        userRepository.save(userData);
        return "Data saved";
    }

    @Override
    public String updateUser(UserDTO newUserData) {
        String msg = null;

        if(newUserData.getId() != null){
            userRepository.save(newUserData);
            msg = "Data Updated";
        }else {
            msg = "User not found";
        }

        return msg;
    }
/*
    @Override
    public UserDTO findById(Integer id) {
        return userRepository.findOne(id);
    }*/

    @Override
    public UserDTO findById(Integer id){
        /*return userRepository.findOne(id);*/
        Optional<UserDTO> userData = userRepository.findById(id);
        return userData.orElse(null);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public String deleteUserById(Integer id) {
        UserDTO userDTO = findById(id);
        if(userDTO == null){
            return "not found";
        }
        userRepository.delete(userDTO);
        return "user deleted";
    }

}
