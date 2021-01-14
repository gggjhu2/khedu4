package parameter;


public class parameter {

	public static void main(String[] args) {
		class Data{int x;}
		
		Data d =new Data();
		d.x =10;
		System.out.println("main() : x ="+d.x );
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main (): x ="+d.x);
	}
	
	static void change(int x) {
		
		x=10000;
		System.out.println("change() : =" +x);
	}
}
