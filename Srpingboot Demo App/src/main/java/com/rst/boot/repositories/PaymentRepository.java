package com.rst.boot.repositories;

import com.rst.boot.domain.PaymentDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentDTO, Integer> {
    //data
}
