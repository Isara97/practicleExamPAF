package com.rst.boot.services.Impl;

import com.rst.boot.domain.PayDTO;
import com.rst.boot.repositories.PayRepository;
import com.rst.boot.services.PayServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PayServiceImpl implements PayServices {

    @Autowired
    private PayRepository payRepository;

    @Override
    public List<PayDTO> findAllPays() {
        List<PayDTO> payments = payRepository.findAll();
        return payments;
    }

    @Override
    public String savePays(PayDTO payData) {
        payRepository.save(payData);
        return "Payment Data saved";
    }

    @Override
    public String updatePays(PayDTO newPayData) {
        String msg = null;

        if(newPayData.getId() != null){
            payRepository.save(newPayData);
            msg = "Data Updated";
        }else {
            msg = "Payment not found";
        }

        return msg;
    }

    @Override
    public PayDTO findById(Integer id) {
        Optional<PayDTO> payData = payRepository.findById(id);
        return payData.orElse(null);
    }

    @Override
    public String deletePayById(Integer id) {
        PayDTO payDTO = findById(id);
        if(payDTO == null){
            return "not found";
        }
        payRepository.delete(payDTO);
        return "customer payment deleted";
    }
}
