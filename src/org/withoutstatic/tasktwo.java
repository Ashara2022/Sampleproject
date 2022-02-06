package org.withoutstatic;

public class tasktwo {
	
	static void m1() {
		int ref = 5000;
		System.out.println(ref);
	}

	static void m2() {
		m1();
		int ab=100;
		System.out.println(ab);
	}
	public static void main(String[] args) {
		tasktwo obj = new tasktwo();
		obj.m2();
	}
}
