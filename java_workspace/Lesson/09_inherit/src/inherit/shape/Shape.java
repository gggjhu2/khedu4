package inherit.shape;

public class Shape {
	
	
	
	
	public double area;//넓이

	public Shape() {
		super();
	}

	public Shape(double area) {
		super();
		this.area = area;
	}

	
	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	
	public void draw() {
		
		System.out.println("도형을그리고있다.");
	}
	
	
}
