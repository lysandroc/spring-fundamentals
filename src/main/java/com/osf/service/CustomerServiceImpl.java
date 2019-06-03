package com.osf.service;

import java.util.List;

import com.osf.model.Customer;
import com.osf.repository.CustomerRepository;
import com.osf.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
	
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
}
