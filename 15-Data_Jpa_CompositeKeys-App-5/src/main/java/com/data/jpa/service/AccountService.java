package com.data.jpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.data.jpa.entity.Account;
import com.data.jpa.entity.AccountPK;
import com.data.jpa.repository.AccountRepository;

@Service
public class AccountService {

	private AccountRepository accRepo;

	public AccountService(AccountRepository repository) {
		this.accRepo = repository;
	}

	public void getDataUsingPK() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("SAVINGS");
		pk.setHolderName("Bitwise");

		Optional<Account> findById = accRepo.findById(pk);
		if (findById.isPresent()) {
			System.out.println(findById.get());
		}
	}

	public void saveAccData() {
		AccountPK pk = new AccountPK();
		pk.setAccId(101);
		pk.setAccType("SAVINGS");
		pk.setHolderName("Bitwise");

		Account acc = new Account();
		acc.setBranchName("Delhi");
		acc.setMinBal(500.00);

		acc.setAccPK(pk);// setting pk class object to entity obj

		accRepo.save(acc);
	}
}
