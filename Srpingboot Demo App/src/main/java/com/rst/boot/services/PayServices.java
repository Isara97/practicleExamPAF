package com.rst.boot.services;

import com.rst.boot.domain.PayDTO;

import java.util.List;

public interface PayServices {

    List<PayDTO> findAllPays();

    String savePays(PayDTO paymentData);

    String updatePays(PayDTO newPaymentData);

    PayDTO findById(Integer id);

    String deletePayById(Integer id);

    /*PayDTO findById(Integer id);*/
}
