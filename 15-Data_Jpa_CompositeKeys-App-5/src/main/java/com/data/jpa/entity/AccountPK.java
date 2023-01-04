package com.data.jpa.entity;

import java.io.Serializable;
import javax.persistence.Embeddable;

@Embeddable
public class AccountPK implements Serializable {

	private Integer accId;
	private String accType;
	private String holderName;

	public AccountPK() {

	}

	public AccountPK(Integer accId, String accType, String holderName) {
		super();
		this.accId = accId;
		this.accType = accType;
		this.holderName = holderName;
	}

	public Integer getAccId() {
		return accId;
	}

	public void setAccId(Integer accId) {
		this.accId = accId;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	@Override
	public String toString() {
		return "AccountPK [accId=" + accId + ", accType=" + accType + ", holderName=" + holderName + "]";
	}

}
