package com.lti.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class LoanDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "LOANID")
	@SequenceGenerator(name = "LOANID" , sequenceName = "LOAN_ID_SEQ" , allocationSize = 1)
	@Column(name = "LOAN_ID")
	private int loanId;
	
	@Column(name = "LOAN_AMMOUNT")
	private String loanAmount;
	
	@Column(name = "BANK_ACCOUNT_NO")
	private String bankAccountNo;

	@Column(name = "EMI")
	private String emi;
	
	@Column(name = "LOAN_TENURE")
	private String loanTenure;
	
	@Column(name = "ROI")
	private String roi;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "STATUS")
	private int status;
	
	@Column(name = "SALARY")
	private int salary;
	
	@Column(name = "REJECT")
	private int rejectStatus;
	
	public int getRejectStatus() {
		return rejectStatus;
	}

	public void setRejectStatus(int rejectStatus) {
		this.rejectStatus = rejectStatus;
	}

	public int getLoanId() {
		return loanId;
	}

	public LoanDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	


	public LoanDetails(String loanAmount, String bankAccountNo, String emi, String loanTenure, String roi, String email,
			int status, int salary, int rejectStatus) {
		super();
		this.loanAmount = loanAmount;
		this.bankAccountNo = bankAccountNo;
		this.emi = emi;
		this.loanTenure = loanTenure;
		this.roi = roi;
		this.email = email;
		this.status = status;
		this.salary = salary;
		this.rejectStatus = rejectStatus;
	}

	@Override
	public String toString() {
		return "LoanDetails [loanId=" + loanId + ", loanAmount=" + loanAmount + ", bankAccountNo=" + bankAccountNo
				+ ", emi=" + emi + ", loanTenure=" + loanTenure + ", roi=" + roi + ", email=" + email + ", status="
				+ status + ", salary=" + salary + ", rejectStatus=" + rejectStatus + "]";
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	
	public String getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getBankAccountNo() {
		return bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getEmi() {
		return emi;
	}

	public void setEmi(String emi) {
		this.emi = emi;
	}

	public String getLoanTenure() {
		return loanTenure;
	}

	public void setLoanTenure(String loanTenure) {
		this.loanTenure = loanTenure;
	}

	public String getRoi() {
		return roi;
	}

	public void setRoi(String roi) {
		this.roi = roi;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}


}
