import java.util.ArrayList;

public class Cart {
	
	private ArrayList <Items> orders = new ArrayList<>();
	
	//Default no argument constructor
	public Cart() {
		
	}
	
	public void addOrder(Items theOrder) {
		orders.add(theOrder);
	}
	
	public int getTotalBoxes() {
		int totalBoxes = 0;
		for(Items order: orders) {
			totalBoxes += order.getnumItem();
		}
	return totalBoxes;
		
	}
	
	public void removeVariety(String variety) {
		for(int i = orders.size() - 1; i >= 0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
	}
	
	public void showOrder() {
		for(Items order: orders) {
			System.out.println("Item: " + order.getVariety() + "/t Price: " + order.getPrice()
			+ "/n Quantity: " + order.getnumItem());
		}
	}

	public void updateOrder(String variety, int price, int numItem) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.set(i, new Items(variety, price, numItem));
			}
		}
		
	}

}
