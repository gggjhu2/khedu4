package kh.java.inherit.pruduct.model.vo;

public class TV extends Product {
	private int chennal;
	private int size;
	
	
	public TV(){
		
		
	}
	//
	//	
		public TV(String brand, String productName, int price ,int chennal,int size
				){
			
			this.setBrand(brand);
			this.setProductName(productName);
			this.setPrice(price);
			this.chennal=chennal;
			this.size = size;
			
		}
			

		public int getChennal() {
			return chennal;
		}
		public void setChennal(int chennal) {
			this.chennal = chennal;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public String getTVInfo() {
			return getBrand() + ", " + getProductName() + ", " + getPrice() + ", "
					 + chennal+ ", " + size  ;
		}
}
