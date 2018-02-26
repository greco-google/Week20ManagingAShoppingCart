import java.util.Scanner;

public class ShopApp {
	

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	Cart myOrder = new Cart();
	Items order;
	
	System.out.println("Welcome to your shopping cart");
	System.out.println("Please select a task");
	System.out.println("Press 1 to order an item");
	System.out.println("Press 2 to remove an order");
	System.out.println("Press 3 to update an order");
	System.out.println("Press 4 to view current order");
	System.out.println("Press 5 to exit");
	
	String choice  = input.nextLine();
	
	while(!choice.equals("5")) {
		if(choice.equals("1")) {
			System.out.println("What item would you like?");
			String variety = input.nextLine();
			System.out.println("What is the price of that item?");
			double price = input.nextDouble();
			System.out.println("How many " + variety + " do you want?");
			int numItem = input.nextInt();
			input.nextLine();
			order = new Items(variety, price, numItem);
			myOrder.addOrder(order);
			}
		
		
		else if(choice.equals("2")) {
			System.out.println("What item would you like to remove?");
			myOrder.showOrderNoPrice();
			System.out.println();
			String variety = input.nextLine();
			myOrder.removeVariety(variety);
			}
		
		else if(choice.equals("3")) {
			System.out.println("What food do you want to update?");
			myOrder.showOrderNoPrice();
			System.out.println();
			String variety = input.nextLine();
			System.out.println("What is the price of that item?");
			double price = input.nextDouble();
			System.out.println("Now, how many " + variety + " do you want?");
			int numItem = input.nextInt();
			input.nextLine();
			myOrder.updateOrder(variety, price, numItem);

			}
		
		
		else if(choice.equals("4")) {
			System.out.println();
			System.out.println("Your Current Order: ");
			myOrder.showOrder();
			System.out.println();
			}
		
		else if(choice.equals("5")) {
			//System.out.println("Your total today will be $" + Items.getTotalPrice() + "\nThank you for shopping with us today");
			System.exit(0);
			}
		else {
			System.out.println("Invalid input");
		}
		System.out.println("Please select another Task");
		System.out.println("Press 1 to order cookies");
		System.out.println("Press 2 to remove an order");
		System.out.println("Press 3 to update an order");
		System.out.println("Press 4 to view current order");
		System.out.println("Press 5 to exit");
		choice = input.nextLine();
		}
	}
}