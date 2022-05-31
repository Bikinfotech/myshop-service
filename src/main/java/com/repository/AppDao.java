package com.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Login;

@Repository
public interface AppDao extends CrudRepository<Login, String>{
	
//	@Query(value = "SELECT BALANCE FROM account WHERE ACCOUNT_ID = ?1", nativeQuery = true)
//	double getBalance(String accountId);
//	
//	@Transactional
//	@Modifying
//	@Query(value = "UPDATE account  SET BALANCE = (BALANCE - ?2) WHERE ACCOUNT_ID = ?1", nativeQuery = true)
//	void withdraw(String accountId, double amount);
//	
//	@Modifying
//	@Transactional
//	@Query(value = "update account as a set a.balance = (a.balance + ?2) where a.account_id = ?1", nativeQuery = true)
//	void deposit(String accountId, double amount);

}
