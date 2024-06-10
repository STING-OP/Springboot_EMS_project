package com.assignment2.assignment2.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment2.assignment2.pojo.Address;

public interface AddressRepo  extends JpaRepository<Address, Integer> {

}
