package example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) {
		List<String>list = new ArrayList<String>( );
		list.add("India"); 
		list.add("USA");
		list.add("China");
		list.add("India");
		list.add("Russia");
		list.add("England"); 
		
		System.out.println("Size : "+list.size());
		System.out.println("List : "+list.toString());
		
		list.add(3, "Nepal");
		System.out.println("List : "+list.toString());
		int index = 5; 
		String e5 = list.get(index); 
		System.out.println("Ele : "+e5);
		e5 = e5.toUpperCase(); 
		System.out.println("Ele : "+e5);
		list.set(index, e5); 
		System.out.println("List : "+list.toString());
		list.remove(index); 
		System.out.println("List : "+list.toString());
		
		
		
		String find="England";
		boolean found = list.contains(find);
		if(found) {
			System.out.println(find +" is found");
		}
		else {
			System.out.println("not found");
		}
		
		
		int idx = list.indexOf(find); 
		if(idx!=-1)
		  System.out.println("Ele : " + find + " is found at location " + idx);
		else 
		  System.out.println("Element not found");
		
		
		System.out.println("rev Traverse");//rev traverse
		ListIterator<String> trav = list.listIterator(list.size()); 
		while(trav.hasPrevious()) {
			String ele= trav.previous();
			System.out.println(ele);
		}
		
		
		
		

	}

}
