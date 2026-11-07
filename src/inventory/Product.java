package inventory;

import java.util.LinkedHashMap;
import java.util.Map;


public class Product {
	private String name;
	private int quantity;
	//for unit size and price
	private final Map<String, Integer> unitSizePrice = new LinkedHashMap<>();
	
	public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	//Getters & Setters
	public String getName() {return this.name;}
	public int getQuantity() {return this.quantity;}
	public void setName(String name) {this.name = name;}
	public void setQuantity(int quantity) {this.quantity = quantity;}
	
	//unit size and price methods
	public void addUnitSizePrice(String size, int price) {
		this.unitSizePrice.put(size, price);
	}
	
	public int getPrice(String unitSize) {
		return unitSizePrice.get(unitSize);
	}
	
	public void setPrice(String unitSize, int price) {
		if (unitSizePrice.containsKey(unitSize)) {
			unitSizePrice.put(unitSize, price);
		} else {
			System.out.println("Unit Size does not exists");
		}
	}
	
	public void removeUnitSize(String unitSize) {
		unitSizePrice.remove(unitSize);
	}
	
	public Map<String, Integer> getUnitSizePrice(){
		return new LinkedHashMap<>(unitSizePrice);
	}
	
}
