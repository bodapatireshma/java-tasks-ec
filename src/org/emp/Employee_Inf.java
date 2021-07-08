package org.emp;

import org.company.Company;

public class Employee_Inf extends Company {
 
public void empName() {
	System.out.println("Employee");
}
public static void main(String[] args) {
	Employee_Inf emp = new Employee_Inf();
	emp.empName();
	emp.companyName();
	emp.clientName();
	emp.projectName();
	}
}
