package org.jav;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListPract {

	public static void main(String[] args) {
	List li = new LinkedList();
	li.add(1);
	li.add(2);
	li.add(3);
	li.add(4);
	System.out.println(li);
	
	li.remove(2);
	System.out.println(li);
	li.add(2, 4);
	System.out.println(li);
	List array = new ArrayList();
	array.add(5);
	array.add(6);
	array.add(7);
	array.add(8);
	
	System.out.println(array);
	array.remove(2);
	System.out.println(array);
	array.add(2, 9);;
	System.out.println(array);
	Map <Integer,String> mi = new HashMap<>();
	

	

	}

}
