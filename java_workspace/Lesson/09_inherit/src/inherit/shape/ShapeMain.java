package inherit.shape;

public class ShapeMain {

	public static void main(String[] args) {

		
		Circle c1 =new Circle();
		
		
		Circle c2 =new Circle(new Point(200,100),30);
		
		
		c1.draw();//Shape 에있는 메소드
		c2.draw();//Shape 에있는 메소드
		
		
		
		
	}

}
