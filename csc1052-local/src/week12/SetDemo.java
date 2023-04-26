package week12;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> friends = new HashSet<String>();
		
		friends.add("Mark");
		friends.add("Mark2");
		friends.add("Mark3");
		
		Set<String> friends2 = new HashSet<String>();
		
		friends2.add("Mark");
		friends2.add("Mark4");
		friends2.add("Mark5");
		
		// union
		Set<String> allFriends = new HashSet<String>();
		allFriends.addAll(friends2);
		allFriends.addAll(friends);
		
		// intersection
		Set<String> commonFriends = new HashSet<String>(friends);
		commonFriends.retainAll(friends2);
		
		friends.retainAll(friends2);
		System.out.println(friends.toString());
		
		
		Set<String> meal1 = new HashSet<String>();
		meal1.add("Burger");
		meal1.add("Fries");
		meal1.add("Soda");

		Set<String> meal2 = new HashSet<String>();
		meal2.add("Salad");
		meal2.add("Fries");
		meal2.add("Water");

		Set<String> diff = new HashSet<String>(meal2);
		diff.removeAll(meal1);

		System.out.println("Only in meal2: " + diff);

		
		//System.out.println(commonFriends.toString());
		
		
		//System.out.println(friends.toString());
		//System.out.println(friends2.toString());
		//System.out.println(allFriends.toString());
		//System.out.println(friends.contains("Mark"));
		
		friends.remove("Mark");
		friends.remove("Mark2");
		
		//System.out.println(friends.toString());
		
		Set<String> fruits = new TreeSet<String>();
		fruits.add("Apple");
		fruits.add("Cantaloupe");
		fruits.add("Banana");
		
		System.out.println(fruits.toString());
		
		Set<String> fruits2 = new HashSet<String>();
		fruits2.add("Apple");
		fruits2.add("Cantaloupe");
		fruits2.add("Banana");
		
		System.out.println(fruits2.toString());
		
		Set<Integer> numbers = new TreeSet<Integer>();
		numbers.add(2);
		numbers.add(10);
		numbers.add(7);
		numbers.add(1);
		numbers.add(11);
		numbers.add(99);
		
		System.out.println(numbers.toString());
		
		Set<Integer> numbers2 = new HashSet<Integer>();
		numbers2.add(2);
		numbers2.add(10);
		numbers2.add(7);
		numbers2.add(1);
		numbers2.add(11);
		numbers2.add(99);
		
		System.out.println(numbers2.toString());
	}

}
