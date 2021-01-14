package kh.java.oop.encapsulation.account;



//캡슐화
//
//
//
//
//구조체의 단점을 극복한 클래스
//
//	-private 점근제한자를 사용해 filed의 직접 접근을 방지
//	-public 접근제한자를 사용한 method를 이용해 우회적으로 사용
//
//
// 캡슐화
//
//
//
public class Account {
	
	//private 접근제한자 :같은 클래스 내부에서만 접근가능.
	private String name;
	private long balance; //잔액
	
	//public method 를 통해 우회접근
	//setter :필드값을 세팅하기 위한목적
	//this : 현재 객체를 가리키는 메소드안의 숨은 참조값이다.
//	public void setBalance(long balance_) {
//		                    //매개변수이름은어떤걸로해도상관없다.
//							//어카운트 의 변수명과 겹치는것을방지하기위해
//							//이름을바꾼다.but 어카운트의 이름과동일시하여
//							//사용하는방법은 this.어카운트의 필드이름하면
//							//this.어카운트필드이름은 어카운트의 필드를가리키게되고
//							//뒤의 어카운트필드이름과 동일한 이름의 매개변수는 
//							//셋 벨런스메서드의 메게변수명이된다.
//							//기존의 작성문구를 변경해보겠다.
//		//balance=balance_;
//		
//	}
//	public void setName(String name_) {
//		
//	//	name =name;
//		//The assignment to variable name has no effect 이름이같아 효과가없다는뜻
//		name =name_;
//		
//		//전달받은 name_의 값을 account 프라이빗 필드인 name에 대입해라
//	}
//	
	
	//==>다음과같이 변경가능하다.
	public void setBalance(long balance) {
		this.balance =balance;
		//this.balance는필드의 밸런스를가리킨다.
		//  = 뒤의 벨런스는  setBalance 메서드의 매개변수를 long balance를 가리킨다.
	}
	
//	 public  String getName() {
//		 
//		 return name;
//		 //스트링 겟네임 메서드는 어카운트 필드의 프라이빗 네임을 리턴한다.
//		 
//	 }

	//같은방식으로 네임도 같은이름의 매개변수명으로 this.name을이용하여 변경하여본다.
	public void  setName(String name) {
		this.name=name;
				
	}
	
	
	 public  long getBalance() {
		 
		 return balance;
		 //롱 겟 벨런스 메서드는 어카운트 필드의 벨런스값을 리턴한다.
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
	 //
	 //입금 메서드를 따로 작성해보겟다.
	 //
	public void deposit(long money) {
		
		if(money>0) {
			
			balance +=money;
			System.out.println(name+"님 계좌에"+money+"원이 입금되었습니다.");
		}else
			System.out.println("잘못된 금액이 입력되었습니다.");
		
		
	}
	
	//
	//출금 메서드를 작성해보겠다.
	//
	
	
	public void Whithdraw(long money) {
		
		if (money<=balance) {
			balance -=money;
			System.out.println(name+"님 계좌에"+money+"원이 출금되었습니다.");

		}else
			System.out.println("잔액이 부족합니다.");
	}
	
	
	
	
}
