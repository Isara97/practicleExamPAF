package com.rst.boot.controllers;

import com.rst.boot.domain.PaymentDTO;
import com.rst.boot.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/payment")
public class Payment {

    @Autowired
    private PaymentServices paymentServices;

    @GetMapping(value = "/all")
    public List<PaymentDTO> allPayments(){
        return paymentServices.findAllPayments();
    }

    @PostMapping(value = "/addPayments")
    public String addPayments(@RequestBody PaymentDTO paymentData){
        return paymentServices.savePayments(paymentData);
    }

    @PutMapping(value = "/update")
    public String updatePayments(@RequestBody PaymentDTO newPaymentData){
        return paymentServices.updatePayments(newPaymentData);
    }

    @GetMapping(value = "/find/{id}")
    public PaymentDTO getUserById(@PathVariable Integer id){
        return paymentServices.findById(id);
    }

    @GetMapping("delete/{id}")
    public String deletePaymentById(@PathVariable Integer id){
        return paymentServices.deletePaymentById(id);
    }

}
