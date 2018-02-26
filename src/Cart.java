import java.util.ArrayList;

public class Cart {
	
	private ArrayList <Items> orders = new ArrayList<>();
	
	//Default no argument constructor
	public Cart() {
		
	}
	
	public void addOrder(Items theOrder) {
		orders.add(theOrder);
	}
	
	public int getTotal() {
		int total = 0;
		for(Items order: orders) {
			total += order.getPrice() * order.getnumItem();
		}
	return total;
		
	}
	
	public int totalPrice() {
		int total = 0;
		for(Items order: orders) {
			double totalPrice = order.getPrice() * order.getnumItem();
		}
	return total;
		
	}
	
	
	public void removeVariety(String variety) {
		for(int i = orders.size() - 1; i >= 0; i--) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.remove(i);
			}
		}
	}
	
	public void showOrder() {
		for(Items item: orders) {
			System.out.println("Item: " + item.getVariety() + "\t Price: $" + item.getPrice()
			+ "\t Quantity: " + item.getnumItem() + "\nTotal Price: $" + item.getTotalPrice());
			
		}
	}
	public void showOrderNoPrice() {
		for(Items order: orders) {
			System.out.println("Item: " + order.getVariety()
			+ "\t Quantity: " + order.getnumItem());
			
		}
	}

	public void updateOrder(String variety, double price, int numItem) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.set(i, new Items(variety, price, numItem));
			}
		}
		
	}

}
