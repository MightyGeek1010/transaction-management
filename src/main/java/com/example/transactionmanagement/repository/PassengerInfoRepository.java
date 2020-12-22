package com.example.transactionmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.transactionmanagement.entity.PassengerInfo;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long>{

}
