package kh.java.inherit.product.model.vo;

public class Product {

	private String brand;
	private String productName;
	private int price;
	
	public Product() {
		
	}
					//전달받을 매개변수 들
	public Product(String brand, String productName, int price) {
		this.brand = brand;
	//클래스내의 프라이빗 브랜드//전달받을 부랜드
		this.productName = productName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getProductInfo() {
		return brand + ", " + productName + ", " + price;
	}
	
	@Override
	public String toString() {
		return brand + ", " + productName + ", " + price;
	}
	
}
