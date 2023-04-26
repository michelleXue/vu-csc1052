package week13;

import java.util.Map;
import java.util.TreeMap;

public class CashierMap {

	public static void main(String[] args) {
		
		// 1. create a map object represents the checkout table
		
		// 1.1 initialize a map object
		Map<String, Double> checkoutMap = new TreeMap<String, Double>();

		// 1.2 adding map entries
		checkoutMap.put("Banana", 2.0);
		checkoutMap.put("Apple", 1.5);
		checkoutMap.put("Orange", 1.6);
		checkoutMap.put("Tomato", 3.5);
		checkoutMap.put("Egg", 4.0);
		
		// 2. create a purchased item array
		String[] bucket = {"Egg", "Tomato", "Apple", "Egg"};
		
		// 3. calculate the final price.
		double finalPrice = 0.0;
		for (int i = 0; i < bucket.length; i++) {
			finalPrice = finalPrice + checkoutMap.get(bucket[i]);
		}
		
		double finalPrice2 = 0.0;
		for (String name : bucket) {
			finalPrice2 = finalPrice2 + checkoutMap.get(name);
		}
		
		System.out.println(finalPrice);
		System.out.println(finalPrice2);
		
		for (String word : checkoutMap.keySet()) {
            System.out.println("\t" + word + " - " + checkoutMap.get(word));
        }
		
	}

}
