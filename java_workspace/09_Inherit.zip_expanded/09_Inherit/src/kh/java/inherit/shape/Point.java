package kh.java.inherit.shape;

public class Point {
	private int x; 	//가로축 좌표
	private int y;	//세로축 좌표
	
	public Point() {}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	//투스트링을 오버라이딩하지안흥면
	//오브잭트의 투스트링이 그대로 적용되어 좌포값이 실행된다.
	//그를해결하기위해 투스트링 메소드를 오버라이드해서 수정해사용해준다
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
	
	
}
