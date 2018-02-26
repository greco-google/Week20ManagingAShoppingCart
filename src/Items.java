public class Items {

		
		private String variety;
		private int numItem;
		private int price;
		
		private int Item1 = 1;
		private int Item2 = 5;
		private int Item3 = 8;
		private int Item4 = 12;
		private int Item5 = 15;


		public Items(String variety, int price, int numItem) {
			super();
			this.variety = variety;
			this.price = price;
			this.numItem = numItem;
		}
		
		public String getVariety() {
			return variety;
		}
		
		public int getPrice() {
			return price;
		}
		
		public void setPrice(int price) {
			this.Item1 = Item1;
			this.Item2 = Item2;
			this.Item3 = Item3;
			this.Item4 = Item4;
			this.Item5 = Item5;
			
		}
		
		public int getnumItem() {
			return numItem;
		}


}