package com;

public class Employee {
	private int empId;
	private String name;
	
	
	public int getempId() {
		return empId;
	}
	public void setempId(int empId) {
		this.empId = empId;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public Employee()
	{
		
	}
	@Override
	public String toString() {
		return "Employee [Emp_Id=" + empId + ", Name=" + name + "]";
	}

}
