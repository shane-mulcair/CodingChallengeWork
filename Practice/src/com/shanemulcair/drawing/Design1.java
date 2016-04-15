package com.shanemulcair.drawing;

import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
public class Design1 extends JComponent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		JFrame jf=new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(0,0,850,850);
		jf.getContentPane().add(new Design1());
		jf.setVisible(true);
	}
	
	public void paint(Graphics g){
		g.drawRect(10, 10, 810, 810);
		g.drawLine(10,410,820,410);
		g.drawLine(410, 10, 410, 820);
		for(int i=10;i<415;i+=5){
			g.drawLine(i, 410, 410, 420-i);
			g.drawLine(i, 410, 410, 400+i);
			g.drawLine(410, 10+i, 400+i, 410);
			g.drawLine(410, 820-i, 400+i, 410);
			g.drawLine(10, 420-i, i, 10);
			g.drawLine(10, 410+i, i, 810);
			g.drawLine(410+i, 10, 820, i);
			g.drawLine(400+i, 820, 820, 820-i);
		}
		
	}

}
