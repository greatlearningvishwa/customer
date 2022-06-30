package com.custotomer.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.custotomer.customer.model.Customerentity;
import com.custotomer.customer.service.Customerservice;


import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class Customercontroller {
@Autowired
	Customerservice service;

@GetMapping("/getlist")
public List<Customerentity> get() {
	log.info("customer get");
	 List<Customerentity> book=service.getCustomer();
	 return book;

}
@GetMapping("/addcustomer")
public String add(Customerentity ent) {
	service.addCustomer(ent);
	return "customer added";
}
@GetMapping("/delete")
public String delete(int id) {
	service.deleteCustomer(id);
	return "customer deleted";
}
}
