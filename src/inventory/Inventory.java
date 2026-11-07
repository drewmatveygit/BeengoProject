package inventory;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Collections;


public class Inventory {
	//one inventory only
	private final Map<String, Product> inventory = new HashMap<>();
	
	public Inventory() {}
	
	public boolean contains(Product product) {
		//check name only
		return inventory.containsKey(product.getName());
	}
	
	//ADD & REMOVE
	public void addProduct(Product product) {
		//duplicate check
		if (contains(product)) {
			System.out.println("Product already exists");
			return;
		}
		inventory.put(product.getName(), product);
	}
	
	public void removeProduct(Product product) {
		//non existent
		if (!contains(product)) {
			System.out.println("Product not found");
			return;
		}
		inventory.remove(product.getName());
	}
	
	//VALUE UPDATING
	public void updateQuantity(Product product, int quantity) {
		if (!contains(product)) {
			System.out.println("Product not found");
			return;
		} inventory.get(product.getName()).setQuantity(quantity);
	}
	
	public Collection<Product> getProducts(){
		//collate into one collection for read only access
		//returns whole collection values
		return Collections.unmodifiableCollection(inventory.values());
	}
	
	
	//TESTER
	public void displayInventory() {
		System.out.println("======INVENTORY=====");
		for (Product p:inventory.values()) {
			System.out.printf("%s: %d", p.getName(), p.getQuantity() );
		}
	}
	
}
