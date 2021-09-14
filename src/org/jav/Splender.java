package org.jav;

public class Splender extends MethodOverriding {
	
	@Override
	public void bike(int speed) {
		// TODO Auto-generated method stub
		System.out.println("splender is running"+ speed);
	}

	public static void main(String[] args) {
		MethodOverriding m = new Splender();
		
	 // its not possible  Splender s = new MethodOverriding();
	   m.bike(100);
		

	}

}
