package practice.com.kh.test.product.model.vo;






public class Test {

	public static void main(String[] args) {

		Product[] pArr = new Product[4];

		pArr[0] = new Product();

		pArr[1] = new Product();

		pArr[2] = new Product();
		pArr[3] = new Product();




		for(int i = 0; i < pArr.length; i++) {

		System.out.println(pArr[i].getPrice());

		}

		}

		}