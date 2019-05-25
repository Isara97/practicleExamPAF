package com.rst.boot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/cart")
public class Cart {

    @RequestMapping(method = RequestMethod.GET)
    public String index(){
        return "register";
    }
}
