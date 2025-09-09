package com.example.myproject.internal_working_of_spring_boot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InternalWorkingOfSpringBootApplication implements CommandLineRunner {

	public static void main(String[] args) 
	{
		SpringApplication.run(InternalWorkingOfSpringBootApplication.class, args);
	}

	private final PaymentService paymentService;

	public InternalWorkingOfSpringBootApplication(PaymentService paymentService) {
		this.paymentService = paymentService;
	}

	@Override
	public void run(String... args) throws Exception 
	{
		String payment = paymentService.pay();
		System.out.println("Payment Done: " + payment);
	}
}
