package com.data.jpa.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.data.jpa.entity.Account;
import com.data.jpa.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK>{
	

}
