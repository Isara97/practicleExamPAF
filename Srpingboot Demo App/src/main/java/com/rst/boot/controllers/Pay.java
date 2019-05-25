package com.rst.boot.controllers;

import com.rst.boot.domain.PayDTO;
import com.rst.boot.domain.PaymentDTO;
import com.rst.boot.services.PayServices;
import com.rst.boot.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pay")
public class Pay {
    @Autowired
    private PayServices payServices;

    @GetMapping("/all")
    public List<PayDTO> allPays(){
        return payServices.findAllPays();
    }

    @PostMapping("/add")
    public String addPays(@RequestBody PayDTO paymentData){
        return payServices.savePays(paymentData);
    }

    @PutMapping("/update")
    public String updatePays(@RequestBody PayDTO newPaymentData){
        return payServices.updatePays(newPaymentData);
    }

    @GetMapping("/find/{id}")
    public PayDTO getPayById(@PathVariable Integer id){
        return payServices.findById(id);
    }

    @GetMapping("delete/{id}")
    public String deletePayById(@PathVariable Integer id){
        return payServices.deletePayById(id);
    }
}
