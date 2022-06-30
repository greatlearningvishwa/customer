package com.custotomer.customer.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.custotomer.customer.model.Customerentity;

public interface Cutsomerrepo extends JpaRepository<Customerentity, Integer> {

}
