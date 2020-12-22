package com.example.transactionmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.transactionmanagement.dto.FlightBookingAcknowledgement;
import com.example.transactionmanagement.dto.FlightBookingRequest;
import com.example.transactionmanagement.service.FlightBookingService;

@RestController
public class FlightBookingController {

	@Autowired
	private FlightBookingService service; 
	
	@PostMapping("/bookFlightTicket")
	public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request) {
		return service.bookFlightTicket(request);
	}
	
}
