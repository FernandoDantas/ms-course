package br.com.fernandojr.hrpayroll.services;

import org.springframework.stereotype.Service;

import br.com.fernandojr.hrpayroll.entities.Payment;

@Service
public class PaymentService {
	
	public Payment getPayments(long workerId, int days) {
		return new Payment("Bob", 200.0, days);
	}

}
