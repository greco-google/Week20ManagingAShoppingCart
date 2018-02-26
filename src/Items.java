public class Items {

		
		private String variety;
		private int numItem;
		private double price;
		private double totalPrice;




		public void setTotalPrice(double totalPrice) {
			this.totalPrice = totalPrice;
		}

		public Items(String variety, double price, int numItem) {
			super();
			this.variety = variety;
			this.price = price;
			this.numItem = numItem;
		}
		
		public String getVariety() {
			return variety;
		}
		
		public double getPrice() {
			return price;
		}
		
		public double getTotalPrice() {
			return totalPrice;
		}
		
		public void setPrice(double price) {
			
		}
		
		public int getnumItem() {
			return numItem;
		}


}