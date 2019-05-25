package com.rst.boot.services.Impl;

import com.rst.boot.controllers.Payment;
import com.rst.boot.domain.PaymentDTO;
import com.rst.boot.repositories.PaymentRepository;
import com.rst.boot.services.PaymentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentServicesImpl implements PaymentServices {
    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public List<PaymentDTO> findAllPayments() {
        List<PaymentDTO> allPayments = paymentRepository.findAll();
        return allPayments;
    }

    @Override
    public String savePayments(PaymentDTO paymentData) {
        paymentRepository.save(paymentData);
        return "Payment Data saved";
    }

    @Override
    public String updatePayments(PaymentDTO newPaymentData) {
        String msg = null;

        if(newPaymentData.getId() != null){
            paymentRepository.save(newPaymentData);
            msg = "Data Updated";
        }else {
            msg = "Payment not found";
        }

        return msg;
    }


    @Override
    public PaymentDTO findById(Integer id) {
        Optional<PaymentDTO> paymentData = paymentRepository.findById(id);
        return paymentData.orElse(null);
    }

    @Override
    public String deletePaymentById(Integer id) {
        PaymentDTO paymentDTO = findById(id);
        if(paymentDTO == null){
            return "not found";
        }
        paymentRepository.delete(paymentDTO);
        return "payment deleted";
    }
}
