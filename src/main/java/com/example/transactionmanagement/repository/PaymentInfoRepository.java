package com.example.transactionmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transactionmanagement.entity.PaymentInfo;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
