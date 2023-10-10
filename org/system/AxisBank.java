package org.system;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Desposited amount changed");
	}
	public static void main(String[] args) {
		AxisBank Bank=new AxisBank();
		Bank.deposit();
		Bank.fixed();
		Bank.saving();
	}
}
