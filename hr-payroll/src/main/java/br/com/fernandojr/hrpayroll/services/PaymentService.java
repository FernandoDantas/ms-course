package br.com.fernandojr.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fernandojr.hrpayroll.entities.Payment;
import br.com.fernandojr.hrpayroll.entities.Worker;
import br.com.fernandojr.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {	
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayments(long workerId, int days) {		
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}

}
