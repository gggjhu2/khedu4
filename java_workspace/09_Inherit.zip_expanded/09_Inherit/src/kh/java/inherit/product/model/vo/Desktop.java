package kh.java.inherit.product.model.vo;

public class Desktop extends Product {

	private String os;
	private String monitor;
	private String keyboard;
	
	public Desktop() {
		
	}
	
	/**
	 * brand, productName, price, os, monitor, keyboard
	 * 
	 *  Desktop d = new Desktop("삼성", "삼성대탑", "윈도우", 1_000_000, 
	 *  						"27인치 좋은거", "기계식키보드");
	 */
	public Desktop(String brand, String productName, int price,
				   String os, String monitor, String keyboard) {
		
//		this.brand = brand;
//		this.productName = productName;
//		this.price = price;
		//상속은되지만 직접접근할수없다.
		
		//상속받은 public메소드는 현재객체 소속인것처럼 사용가능
		//프로덕트의 필드이기때문에 세터를이용해서 우회적으로 값을 넣을수있다.
		this.setBrand(brand);
		this.setProductName(productName);
		this.setPrice(price);
		
		this.os = os;
		this.monitor = monitor;
		this.keyboard = keyboard;
		
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
//		return getBrand() + ", " + getProductName() + ", " + getPrice() + ", "
//			 + os + ", " + monitor + ", " + keyboard;
		//부모클래스 의 프라이빗 필드는 직접접근이안되기떄문에 게터를이용해 전달받을수있다
		
		return getProductInfo() 
			 + ", " + os + ", " + monitor + ", " + keyboard;
		
		//이방식 유념해서 잘알아보자. 
	}
	
	@Override
	public String toString() {
		return super.toString() + ", " + os + ", " + monitor + ", " + keyboard;
	}
	
}
