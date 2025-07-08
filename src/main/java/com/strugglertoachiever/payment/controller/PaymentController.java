package com.strugglertoachiever.payment.controller;

import com.strugglertoachiever.payment.model.Payment;
import com.strugglertoachiever.payment.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/ping")
    public String ping() {
        return "Payment Service is up";
    }

    @PostMapping
    public Payment makePayment(@RequestBody Payment payment) {
        return paymentService.makePayment(payment);
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{id}")
    public Payment getPaymentById(@PathVariable Long id) {
        return paymentService.getPaymentById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePayment(@PathVariable Long id) {
        paymentService.deletePayment(id);
    }

    @DeleteMapping("/booking/{bookingId}")
    public ResponseEntity<Void> deleteByBookingId(@PathVariable Long bookingId) {
        paymentService.deleteByBookingId(bookingId);
        return ResponseEntity.noContent().build();
    }
}