package org.withoutstatic;

public class sameclass {
	
	int a= 10;
	
	void m1() {
		System.out.println(a);
		
	}
	
	void m2() {
		System.out.println("Welcome");
		m1();
		
	}
	public static void main(String[] args) {
		sameclass obj = new sameclass();
		obj.m1();
		
	}

}
