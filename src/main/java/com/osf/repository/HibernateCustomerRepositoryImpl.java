package com.osf.repository;

import java.util.ArrayList;
import java.util.List;
import com.osf.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Override
	public List<Customer> findAll() {
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("Lysandro");
		customer.setLastName("Carioca");
		
		customers.add(customer);
		return customers;
	}
}
