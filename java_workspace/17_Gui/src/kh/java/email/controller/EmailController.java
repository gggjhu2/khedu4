package kh.java.email.controller;

import java.util.List;

import kh.java.email.io.EmailIO;
import kh.java.email.vo.Email;


//직접 파일에 접근하는 성격의 코드를 
	
	public class EmailController {

		private EmailIO emailIO = new EmailIO();

		public void insertEmail(Email email) {
			emailIO.insertEmail(email);
		}

		public List<Email> loadEmailList() {
			
			
			return emailIO.loadEmailList();
		}

		}
		
