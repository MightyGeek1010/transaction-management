package com.example.transactionmanagement.dto;

import com.example.transactionmanagement.entity.PassengerInfo;
import com.example.transactionmanagement.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
	
	private PassengerInfo passengerInfo; 
	private PaymentInfo paymentInfo;
	
}
