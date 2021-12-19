package com.bridgelabz.addressbookapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class AddressbookapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressbookapplicationApplication.class, args);
		log.info("Employee Payroll App Started.");
	}

}
