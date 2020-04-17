package com.tcs.eam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.eam.model.Customer;
import com.tcs.eam.model.Product;
import com.tcs.eam.model.CustProdDTO;
import com.tcs.eam.repository.CustomerRepository;
import com.tcs.eam.repository.ProductRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;
	
	@Autowired
	private ProductRepository repo1;
	
	public void save(Customer c) {
		repo.save(c);
	}
	
	public void updateCustomer(Long id, String name, int age, String address)
	{
		repo.update(id, name, age, address);
	}
	
	 public Customer get(Long id) {
	     return repo.findById(id).get();
	 }
	     
	 public void delete(Long id) {
	        repo.deleteById(id);
	 }

	public List<Customer> selectAll() {
		// TODO Auto-generated method stub
		return repo.selectAll();
	}
	 
	 public List<Customer> search(String name) {
		    return repo.search(name);
		}

	public List<CustProdDTO> selectJoin() {
		// TODO Auto-generated method stub
		return repo.searchJoin();
	}

	public List<CustProdDTO> search1() {
		// TODO Auto-generated method stub
		return repo.search1();
	}

	public List<Product> searchProduct() {
		// TODO Auto-generated method stub
		return repo1.searchP();
	}
}
