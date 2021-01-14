package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.VVip;
import member.model.vo.Vip;

public class MemberManager {
	Silver[] s= new Silver[10];
	Gold[] g = new Gold[10];
	Vip[] v = new Vip[10];
	VVip[] vv = new VVip[10];
	
	int silverIndex = 0;
	int goldIndex = 0;
	int vipIndex = 0;
	int vvipIndex = 0;
	
	
	public void silverInsert(Silver s) {
		this.s[silverIndex++] = s;
	}
	public void goldInsert(Gold g) {
		this.g[goldIndex++] = g;
	}
	public void vipInsert(Vip v){
		this.v[vipIndex++] =  v;
	}
	public void vvipInsert(VVip vv){
		this.vv[vvipIndex++] =  vv;
	}
	
	public void printData() {
		System.out.println("----------------------------------------<<회원정보>>-----------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-15s\n", "이름","등급","포인트","이자포인트");
		System.out.println("------------------------------------------------------------------------------------------------");
		for(int i=0; i<silverIndex;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", s[i].getName(), s[i].getGrade(), s[i].getPoint(), s[i].getEjapoint());			
		}
		for(int i=0; i<goldIndex;i++) {
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", g[i].getName(), g[i].getGrade(), g[i].getPoint(), g[i].getEjapoint());
		}
		for(int i=0; i<vipIndex; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", v[i].getName(), v[i].getGrade(), v[i].getPoint(), v[i].getEjapoint());
		}
		for(int i=0; i<vvipIndex; i++){
			System.out.printf("%-15s %-15s %-15d %-15.2f\n", vv[i].getName(), vv[i].getGrade(), vv[i].getPoint(), vv[i].getEjapoint());
		}
	}
}
