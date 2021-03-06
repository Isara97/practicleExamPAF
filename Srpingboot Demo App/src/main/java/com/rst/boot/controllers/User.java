package com.rst.boot.controllers;

import com.rst.boot.domain.PaymentDTO;
import com.rst.boot.domain.UserDTO;
import com.rst.boot.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class User {

    @Autowired
    private UserServices userServices;

    @GetMapping("/all")
    public List<UserDTO> allUsers(){
        return userServices.findAllUsers();
    }

    @PostMapping("/add")
    public String addUser(@RequestBody UserDTO UserData){
       return userServices.saveUser(UserData);
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody UserDTO newUserData){
        return userServices.updateUser(newUserData);
    }

    @GetMapping("/find/{id}")
    public UserDTO getUserById(@PathVariable Integer id){
         return userServices.findById(id);

    }

    @GetMapping("delete/{id}")
    public String deleteUserById(@PathVariable Integer id){
        return userServices.deleteUserById(id);
    }


}
