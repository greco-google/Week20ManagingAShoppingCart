import java.util.ArrayList;

public class Cart {
	
	private ArrayList <Items> orders = new ArrayList<>();
	
	//Default no argument constructor
	public MasterOrder() {
		
	}
	
	public void addOrder(Items theOrder) {
		orders.add(theOrder);
	}
	
	public int getTotalBoxes() {
		int totalBoxes = 0;
		for(Items order: orders) {
			totalBoxes += order.getNumBoxes();
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
			System.out.println("Variety: " + order.getVariety() 
			+ " Boxes: " + order.getNumBoxes());
		}
	}

	public void updateOrder(String variety, int numBoxes) {
		for(int i = 0; i < orders.size(); i++) {
			if(orders.get(i).getVariety().equals(variety)) {
				orders.set(i, new Items(variety, numBoxes));
			}
		}
		
	}

}
