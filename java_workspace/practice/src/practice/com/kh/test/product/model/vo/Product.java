package practice.com.kh.test.product.model.vo;


public class Product {
    private String prouctCode;
    private int price;

    public Product() {}

    public Product(String productCode, int price) {
        super();
        this.price = price;
        this.prouctCode = productCode;
    }

    public String getProuctCode() {
        return prouctCode;
    }

    public void setProuctCode(String prouctCode) {
        this.prouctCode = prouctCode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}