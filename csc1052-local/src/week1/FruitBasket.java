package week1;

import java.util.ArrayList;

public class FruitBasket {

	// attributes
	private int capacity = 5;
	ArrayList<String> basket;
	
	//constructor
	public FruitBasket () {
		basket = new ArrayList<String>();
	}
	
	// operation 1: add a fruit
	public void add (String s) {
		basket.add(s);
	}
	
	// operation 2: print all fruit in basket (print)
	public void print() {
		// for each
		for (String fruit : basket) {
			System.out.println(fruit);
		}
	}
}
