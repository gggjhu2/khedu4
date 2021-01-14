package kh.java.inherit.pruduct.model.vo;

public class Desktop extends Product {

	
	private String os;
	private String monitor;
	private String keyboard;
	
	
	public Desktop(){
		
		
	}
	//
	// brand, productName, price
	// 를다 받아줘야한다.  ===>
	//					brand ,productName, price ,os ,monitor ,keyboard
	
	//Desktop d =new Desktop("삼성","삼성대탑","윈도우",1_000_000,"27인치 좋은거","기계식키보드");	
	//	
	//	
		public Desktop(String brand, String productName, int price ,String os, String monitor,
				String keyboard){
			
	//		this.brand=brand;
	//	    this.productName=producName;
	//		this.price =price;				//부모 꺼를 할수없다.
			//다음과같이 수정한다
			this.setBrand(brand);
			this.setProductName(productName);
			this.setPrice(price);
			
			this.os=os;
			this.monitor=monitor;
			this.keyboard=keyboard;
			
		}
	
		public String getOs() {
			return os;
		}
		public void setOs(String os) {
			this.os = os;
		}
		public String getMonitor() {
			return monitor;
		}
		public void setMonitor(String monitor) {
			this.monitor = monitor;
		}
		public String getKeyboard() {
			return keyboard;
		}
		public void setKeyboard(String keyboard) {
			this.keyboard = keyboard;
		}
		
		
		public String getDesktopInfo() {
			return getBrand() + ", " + getProductName() + ", " + getPrice() + ", "
					 + os + ", " + monitor + ", " + keyboard;	
		}
		
		
		
	
	{
		
		

		
	}
}
