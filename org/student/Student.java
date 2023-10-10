package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Naveenkumar");
	}
	public void studentDept() {
		System.out.println("Electronics and Communication");
	}
	public void studentId() {
		System.out.println("1902127");
}
	public static void main(String[] args) {
		Student info=new Student();
		info.collegeCode();
		info.collegeName();
		info.coolegeRank();
		info.departmentName();
		info.studentDept();
		info.studentId();
		info.studentName();
	}

}
