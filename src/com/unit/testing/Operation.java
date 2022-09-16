package com.unit.testing;

public class Operation {
	public boolean check(int num) {
		if(num%2 == 0) {
			System.out.println("Even");
			return true;
		}
		else {
			System.out.println("Odd");
			return false;
		}
	}
	public double divide(double a, double b) {
		System.out.println("The quotient is : ");
		return a/b;
	}
	public String getstring(String name) {
		System.out.println("Your name is : ");
		return name;
	}
	public boolean compare(int a, int b) {
		if(a>b)
			return true;
		else
			return false;
	}

}
