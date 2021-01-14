package kh.java.inherit.pruduct.model.vo;

public class SmartPhone extends Product {
	
		private String os;
		private String carrier;
		
		
		public SmartPhone(){
			
			
		}
		//
		//	
			public SmartPhone(String brand, String productName, int price ,String os, String carrier ){
				
				//this.setBrand(brand);
				//this.setProductName(productName);
				//this.setPrice(price);
				super(brand, productName,price);// 디스대신에 수퍼를이용하여 이렇게 표현을하면 간단하다.
				this.os=os;
				this.carrier=carrier;
				
	
}

			public String getOs() {
				return os;
			}

			public void setOs(String os) {
				this.os = os;
			}

			public String getCarrier() {
				return carrier;
			}

			public void setCarrier(String carrier) {
				this.carrier = carrier;
			}
			
			public String getSmartPhoneInfo() {
				return getBrand() + ", " + getProductName() + ", " + getPrice() + ", "
						 + os + ", " + carrier ;
			}
}