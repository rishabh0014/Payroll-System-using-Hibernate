package com.rishabh.Payroll_Application;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GeteSet {
	private String Name;
	@Id
	private String Id;
	private String Age;
	private String Income;
	private String Bank_Name;
	private String Bank_Account_No;
	private String Salary;
	
	public String getName() {
		return Name;
	}
	public void setName(String eName) {
		this.Name = eName;
	}
	public String getId() {
		return Id;
	}
	public void setId(String Id) {
		this.Id = Id;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String Age) {
		this.Age = Age;
	}
	public String getIncome() {
		return Income;
	}
	public void setIncome(String Income) {
		this.Income = Income;
	}
	public String getBank_Name() {
		return Bank_Name;
	}
	public void setBank_Name(String Bank_Name) {
		this.Bank_Name = Bank_Name;
	}
	public String getBank_Account_No() {
		return Bank_Account_No;
	}
	public void setBank_Account_No(String Bank_Account_No) {
		this.Bank_Account_No = Bank_Account_No;
	}
	public String geteSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		this.Salary = salary;
	}
}
