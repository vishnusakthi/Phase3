package com.simplilearn.entity;

import java.math.BigDecimal;
import java.util.Date;

public class EProductEntity {
	
	private long proID;
	private String proNAME;
	private BigDecimal procost;
	
	
	public EProductEntity() {
		// TODO Auto-generated constructor stub
	}

	public EProductEntity(String proNAME, BigDecimal procost) {
		super();
		this.proNAME = proNAME;
		this.procost = procost;
		
	}
	

	public long getProID() {
		return proID;
	}

	public void setProID(long proID) {
		this.proID = proID;
	}

	public String getProNAME() {
		return proNAME;
	}

	public void setProNAME(String proNAME) {
		this.proNAME = proNAME;
	}

	public BigDecimal getProcost() {
		return procost;
	}

	public void setProcost(BigDecimal procost) {
		this.procost = procost;
	}

	

	@Override
	public String toString() {
		return "EProductEntity [proID=" + proID + ", proNAME=" + proNAME + ", procost=" + procost +  "]";
	}
	
}

