package com.iamneo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iamneo.security.entity.Payment;
import com.iamneo.security.repository.PaymentRepo;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentRepo repo;

    @PostMapping
    public ResponseEntity<Payment> makePayment(@RequestBody Payment payment) {
        Payment savedPayment = repo.save(payment);
        return new ResponseEntity<>(savedPayment, HttpStatus.CREATED);
    }

    // You can add more endpoints for fetching payments, updating, deleting, etc.
}
