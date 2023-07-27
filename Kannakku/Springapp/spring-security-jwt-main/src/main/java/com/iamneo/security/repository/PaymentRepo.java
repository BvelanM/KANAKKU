package com.iamneo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iamneo.security.entity.Payment;

public interface PaymentRepo extends JpaRepository<Payment, Long>{

}
