package com.osf.service;

import java.util.List;

import com.osf.model.Customer;
import com.osf.repository.CustomerRepository;

public interface CustomerService {

	List<Customer> findAll();
	
	void setCustomerRepository(CustomerRepository customerRepository);

}