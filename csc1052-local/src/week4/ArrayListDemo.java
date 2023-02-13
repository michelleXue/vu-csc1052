package week4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// create arraylist
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		
		// set third element to five
		list.set(2, "five");
		
		// reverse the whole list
		List<String> reverselist = new ArrayList<String>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reverselist.add(list.get(i));
		}
		
		list = reverselist;
		
		// print the update list
		for (String element : list) {
			System.out.println(element);
		}
	}

}
