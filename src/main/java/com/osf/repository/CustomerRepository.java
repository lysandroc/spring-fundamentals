package com.osf.repository;

import java.util.List;

import com.osf.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}