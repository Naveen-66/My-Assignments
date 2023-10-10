package org.system;

public class Student {
	public void getStudentInfo(int id,String name) {
		System.out.println(id+"\n"+name);
	}
	public void getStudentInfo(String email,int phoneNumber) {
		System.out.println(email+"\n"+phoneNumber);
	}
	public static void main(String[] args) {
		Student information=new Student();
		information.getStudentInfo(127,"Naveen");
		information.getStudentInfo("abc@gmail.com",245612);
		
	}

}
