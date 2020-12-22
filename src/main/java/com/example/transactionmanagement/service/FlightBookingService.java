package com.example.transactionmanagement.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.transactionmanagement.dto.FlightBookingAcknowledgement;
import com.example.transactionmanagement.dto.FlightBookingRequest;
import com.example.transactionmanagement.entity.PassengerInfo;
import com.example.transactionmanagement.entity.PaymentInfo;
import com.example.transactionmanagement.repository.PassengerInfoRepository;
import com.example.transactionmanagement.repository.PaymentInfoRepository;
import com.example.transactionmanagement.utils.PaymentUtils;

@Service
public class FlightBookingService {

	@Autowired
	private PassengerInfoRepository passengerInfoRepository; 
	@Autowired
	private PaymentInfoRepository paymentInfoRepository; 
	
	public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request) {
		FlightBookingAcknowledgement acknowledgement = null; 
		
		PassengerInfo passengerInfo = request.getPassengerInfo();
		
		passengerInfo = passengerInfoRepository.save(passengerInfo); 
		PaymentInfo paymentInfo = request.getPaymentInfo(); 
		
		PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
		
		paymentInfo.setPassengerId(passengerInfo.getPId());
		paymentInfo.setAmount(passengerInfo.getFare());
		
		paymentInfoRepository.save(paymentInfo);
		return new FlightBookingAcknowledgement("SUCCESS", passengerInfo.getFare(), 
				UUID.randomUUID().toString().split("-")[0], passengerInfo);
		
	}
	
	
}
