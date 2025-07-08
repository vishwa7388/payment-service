package com.strugglertoachiever.payment.service;

import com.strugglertoachiever.payment.model.Payment;
import com.strugglertoachiever.payment.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public Payment makePayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public void deletePayment(Long id) {
        paymentRepository.deleteById(id);
    }

    public void deleteByBookingId(Long bookingId) {
        paymentRepository.deleteByBookingId(bookingId);
    }
}
