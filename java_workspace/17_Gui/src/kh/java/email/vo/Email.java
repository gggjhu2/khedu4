package kh.java.email.vo;

import java.io.Serializable;

public class Email implements Serializable{

	private String email;

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Email(String email) {
		super();
		this.email = email;
	}

	public Email() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
