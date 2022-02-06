package org.withoutstatic;

public class Diffclass2 extends DiffClass {
	
	void m2(){
		System.out.println("Welcome");
		m1();
	}
		private void m3() {
			m2();
			int b= 200;
			System.out.println(b);
	}
	public static void main(String[] args) {
		Diffclass2 s = new Diffclass2();
		s.m3();
	}
}
