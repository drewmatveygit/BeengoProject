package inventory;

import java.util.Map;

public class ProductList {
	public static void displayProductList(Inventory inventory) {
		System.out.println("=====PRODUCT LIST=====");
		for (Product p:inventory.getProducts()) {
			System.out.println(p.getName());
			for (Map.Entry<String, Integer> e : p.getUnitSizePrice().entrySet()) {
				System.out.printf("%s: %d", e.getKey(), e.getValue());
			}
		}
	}
}
