package kh.java.inherit.shape;

import java.util.Arrays;

public class Rectangle extends Shape {

	private Point[] points;
	private int width;
	private int height;
	
	public Rectangle() {}
	
	public Rectangle(Point[] points, int width, int height){
		this.points = points;
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public void draw() {
		System.out.println("네 꼭지점이 [ "+points[0]+","+points[1]+","+points[2]+","+points[3]+" ]이고, 너비가 "+width+", 높이가 "+height+"인 사각형을 그린다." );
	}

	@Override
	public String toString() {
		return "[points=" + Arrays.toString(points) + ", width=" + width + ", height=" + height + "]";
	}

	
}
