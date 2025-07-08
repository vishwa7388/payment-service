package com.strugglertoachiever.payment.repository;

import com.strugglertoachiever.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,Long> {

    void deleteByBookingId(Long bookingId);  //  Custom delete method
}


