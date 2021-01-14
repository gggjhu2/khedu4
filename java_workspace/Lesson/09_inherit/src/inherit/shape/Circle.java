package inherit.shape;


	// Circle has a Point : has a 포함관계 (연관관계)
	//
	// Circle  ───────>point
	//
	// Circle is a Shape : is a 상속관계 (일반화관계)
	//
	// Circle  ──────▷Shape
	//
	//
	//
public class Circle extends Shape {

	
		private Point center;
		private int r;
		
		
		public Circle() {
			//아무런 필드대입이 없다면 , 기본값으로 세팅한다.
			this.center=new Point(100,100);
			this.r=100;
			
			
		}


		public Circle(Point center, int r) {
			super();
			this.center = center;
			this.r = r;
		}


		public Point getCenter() {
			return center;
		}


		public void setCenter(Point center) {
			this.center = center;
		}


		public int getR() {
			return r;
		}


		public void setR(int r) {
			this.r = r;
		}

		//
		// override 상속받은 메소드를 고쳐쓰는것을말한다.
		//
		//	규칙 
		//	1.메소드명 , 파라미터 선언부 ,리턴타입 모두동일해야한다.
		//		-@Override annotation 
		//			
		//	2.접근 제한자는 더넓은 범위로 수정 가능하다.
		//	   -Private(x) => default(x) => protected => public
		//		반대방향으로는 번환불가
		//	  -priavate 메소드는 오버라이드 불가
		//    -default 메소드가 같은 메소드안에서만쓰겠다는것이므로 거의 존재하지않는다.
		//		결국 해당되는 경우는 만약 public이였따면 무조건퍼블릭
		//  	프록텍티드 인경우는 프로텍티드 혹은 퍼블릭으로 바꿔 사용할수잇다.
		//
		//	3.메소드가 던지는 예외 클래스는 줄이거나 , 자식 클래스로 변경가능.
		//		//범위벗어난 어려운내용이므로 나중에 설명
		//
		
		
		
		@Override
		public void draw() {
		
		//	System.out.println("중심점이("+center.getX()+", "+center.getY()+") 이고,"
		//			+"반지름이" + r + "인 원을 그리고 있다.");
			
			System.out.println("중심점이"+ center+ "이고,"
			+ "반지름이" + r + "인 원을 그리고 있다.");
			
			
			
		
		
}
}
