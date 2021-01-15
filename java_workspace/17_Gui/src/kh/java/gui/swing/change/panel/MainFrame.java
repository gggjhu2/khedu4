package kh.java.gui.swing.change.panel;

import java.awt.Color;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;

public class MainFrame extends JFrame {

	public static CustomPanel[] panels =new CustomPanel[3];
	
	
	
	
	public MainFrame(int w, int h, String title) {
		MyUtil.init(this, w, h, title);
		
		//panels 객체 할당
								//현재 패널의 부모를넘긴거다
								//this
		panels[0] =new CustomPanel(this,Color.green,"panel0");
		panels[1] =new CustomPanel(this,Color.lightGray,"panel1");
		panels[2] =new CustomPanel(this,Color.CYAN,"panel2");
		
		add(panels[0]);//시작페이지)
	}

}
