package byte_system.object;

import java.io.Serializable;
import java.util.Calendar;



	// 직렬화 할수 있는 Serializable
	//
	// 객체 입출력 스트림에서 사용되어질 객체는 반드시
	//	Serializable 을구현해야한다.
	//  그렇지않으면 NotSerializableExeption을 발생시킨다.
public class User implements Serializable {
	//The serializable class User does not
	//declare a static final serialVersionUID
	//field of type long ==>user에 에러메세지
	
	
	
	
	/**
	 * 	//클래스별 고유번호
	 */
	private static final long serialVersionUID = 1L;
	private String id ;
	//객체 입출력 스트림에서 해당값을 전송하지않는다.  transient
	private transient/*전송되어서는안되는 값일경우 붙여준다*/ int password ;
	private String name;
	private int age ;
	private Calendar regDate ;
	
	
	
	public User(String id, int password, String name, int age, Calendar regDate) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.regDate = regDate;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", regDate=" + regDate
				+ ", getId()=" + getId() + ", getPassword()=" + getPassword() + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getRegDate()=" + getRegDate() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public int getPassword() {
			return password;
		}
		public void setPassword(int password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Calendar getRegDate() {
			return regDate;
		}
		public void setRegDate(Calendar regDate) {
			this.regDate = regDate;
	}
	
	
	
	
}
