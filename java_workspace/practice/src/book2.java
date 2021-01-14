
public class book2 implements Comparable<book2> {

		private String title;
		private int price;
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public book2(String title, int price) {
			super();
			this.title = title;
			this.price = price;
		}
		public book2() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "book2 [title=" + title + ", price=" + price + "]";
		}
		@Override
		public int compareTo(book2 o) {
			// TODO Auto-generated method stub
			return 0;
		}
	
	
}
