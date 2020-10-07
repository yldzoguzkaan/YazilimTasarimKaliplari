package BuilderPattern;
//at��t�rmal�k olu�turmak i�in

import java.util.ArrayList;
import java.util.List;

public class Snack {
	List<ItemINT> items = new ArrayList<ItemINT>();
	
	public void addItem(ItemINT item) {
		items.add(item);
	}
	
	public float getTotalPrice() {
		float totalPrice = 0.0f;
		
		for (ItemINT itemINT : items) {
			totalPrice += itemINT.price();
		}
		
		return totalPrice;
	}
	
	public void showItems() {
		for (ItemINT itemINT : items) {
			System.out.println("Item:" + itemINT.itemName());
			System.out.println("Item Type:" + itemINT.type().type());//ilki itemINT ikincisi t�remi�lerden gelen
			System.out.println("Item Price:" + itemINT.price());
		}
	}
}
