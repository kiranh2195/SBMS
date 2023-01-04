package com.data.jpa.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BANK_ACCOUNTS")
public class Account {

	@Column(name = "BRANCH_NAME")
	private String branchName;

	@Column(name = "MIN_BAL")
	private Double minBal;

	@EmbeddedId
	private AccountPK accPK;

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(String branchName, Double minBal, AccountPK accPK) {
		super();
		this.branchName = branchName;
		this.minBal = minBal;
		this.accPK = accPK;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	public AccountPK getAccPK() {
		return accPK;
	}

	public void setAccPK(AccountPK accPK) {
		this.accPK = accPK;
	}

	@Override
	public String toString() {
		return "Account [branchName=" + branchName + ", minBal=" + minBal + ", accPK=" + accPK + "]";
	}

}
