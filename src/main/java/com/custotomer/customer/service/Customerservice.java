package com.custotomer.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.custotomer.customer.model.Customerentity;
import com.custotomer.customer.reposit.Cutsomerrepo;

@Service
public class Customerservice {
	@Autowired
Cutsomerrepo service;

	
	public List<Customerentity> getCustomer() {
	return	service.findAll();
	}
	
	
	public String addCustomer(Customerentity enti) {
	
		service.saveAndFlush(enti);
		return "added customer";
	}
	
	public String deleteCustomer(int id) {
		service.deleteById(id);
		return "deleted customer";
	}
}
