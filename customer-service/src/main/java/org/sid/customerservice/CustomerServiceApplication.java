package org.sid.customerservice;

import org.sid.customerservice.entities.customer;
import org.sid.customerservice.repo.customerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
@Bean
	CommandLineRunner start(customerRepository cr){
		return args -> {
		cr.saveAll(List.of(
				customer.builder().name("khaoula").email("khaoula@gmail.com").build(),
				customer.builder().name("tajany").email("tajany@gmail.com").build(),
				customer.builder().name("fouzia").email("fouzia@gmail.com").build()

		));
		cr.findAll().forEach(System.out::println);
	};
 }}

