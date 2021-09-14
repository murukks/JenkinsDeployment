package org.jav;

public class WhileInc {
	private void sample(int a) {
		int b =a;
		while(b>10) {
			System.out.println(b +" is greater than 10");
			b--;
			break;
		}
		
		

	}

	public static void main(String[] args) {
	   WhileInc w = new WhileInc();
	   w.sample(15);
	   
	   for (int i = 0; i < 3; i++) {
      for (int j = i; j < 5; j++) {
	
    	  System.out.print("*");
}
      System.out.println("");
		
	}

	}

}
