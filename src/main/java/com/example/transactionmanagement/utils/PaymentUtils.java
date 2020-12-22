package com.example.transactionmanagement.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.transactionmanagement.exception.InsufficientAmountException;

public class PaymentUtils {

	private static Map<String, Double> paymentMap = new HashMap<>();
	static {
		paymentMap.put("acc1", 12000.0);
		paymentMap.put("acc1", 10000.0);
		paymentMap.put("acc1", 5000.0);
		paymentMap.put("acc1", 8000.0);
		
	}
	
	public static boolean validateCreditLimit(String accNo, double paidAmount) {
		if(paidAmount > paymentMap.get(accNo)) {
			throw new InsufficientAmountException("Insufficient fund...");
		} else {
			return true; 
		}
	}
	
}
