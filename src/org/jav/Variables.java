package org.jav;

public class Variables {
	
	int a=10;
	static int b=11;
	private void sample() {
		System.out.println(a++);
		System.out.println(++b);

	}
	private void sample1() {
		System.out.println(a);
		System.out.println(b);
		

	}

	public static void main(String[] args) {
		Variables v= new Variables();
		v.sample();
		v.sample1();
		Variables v2= new Variables();
		v2.sample();
		v2.sample1();

	}
	

}
//output: 10 12 11 12 10 12 11 12