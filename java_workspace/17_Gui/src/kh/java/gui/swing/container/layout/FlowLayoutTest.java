package kh.java.gui.swing.container.layout;

import javax.swing.JFrame;

import kh.java.gui.util.MyUtil;


public class FlowLayoutTest extends JFrame{

	public FlowLayoutTest(int w , int h, String title) {
		MyUtil.init(this, w, h, title);
	}
	
	public static void main(String[] args) {
	
	new FlowLayoutTest(500,500,"FlowLayoutTest").setVisible(true);
	
	
}
}
