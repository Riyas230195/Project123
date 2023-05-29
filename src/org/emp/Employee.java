package org.emp;

public class Employee {

	private void empId(int age) {
		System.out.println(age);
	}
	private void empId(float salary) {
		System.out.println(salary);
	}
	private void empId(String name) {
		System.out.println(name);
	}
	private void empId(char gender) {
		System.out.println(gender);

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId('M');
		e.empId(15000f);
		e.empId(26);
		e.empId("Riyas");
	}
	
}
