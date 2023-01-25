package week1;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FruitBasket basket = new FruitBasket();
		
		basket.print();
		System.out.println("before adding fruits");
		
		// add two fruits
		basket.add("apple");
		basket.add("banana");
		
		// print
		basket.print();
		
		Circle c = new Circle(2.5);
		System.out.print(c.computeArea());
	}

}
