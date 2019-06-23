package com.bitcamp.web.domains;

import com.bitcamp.web.entities.Customer;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@Lazy
@NoArgsConstructor
public class CustomerDTO {

    private String customerId, customerName,
    password, ssn, phone, city, address, postalcode, photo;
      
	
	public CustomerDTO(Customer customer) {
		this.customerId = customer.getCustomerId();
		this.customerName = customer.getCustomerName();
		this.password = customer.getPassword();
		this.ssn = customer.getSsn();
		this.phone = customer.getPhone();
		this.city = customer.getCity();
		this.postalcode = customer.getPostalcode();
	}



}