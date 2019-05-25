package com.rst.boot.services;

import com.rst.boot.domain.PaymentDTO;

import java.util.List;

public interface PaymentServices {

    List<PaymentDTO> findAllPayments();

    String savePayments(PaymentDTO paymentData);

    String updatePayments(PaymentDTO newPaymentData);

    PaymentDTO findById(Integer id);

    String deletePaymentById(Integer id);

    /*PaymentDTO findById(Integer id);*/
}
