package com.rst.boot.repositories;

import com.rst.boot.domain.PayDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayRepository extends JpaRepository<PayDTO, Integer> {
    //data
}
