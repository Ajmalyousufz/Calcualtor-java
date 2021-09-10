import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Calculator {
	
	static JLabel text_feild;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(540, 600);
		frame.setLocation(500,100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		
		text_feild = new JLabel("0");
		text_feild.setBounds(50, 70, 430, 50);
		text_feild.setForeground(Color.white);
		text_feild.setBackground(Color.gray);
		text_feild.setBorder(new EmptyBorder(0, 10, 0, 10));
		text_feild.setOpaque(true);
		frame.add(text_feild);
		text_feild.setVisible(true);
		
		JButton button7 = new JButton("7");
		button7.setBounds(50, 150, 70, 70);
		button7.setVisible(true);
		frame.add(button7);
		button7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton button8 = new JButton("8");
		button8.setBounds(140, 150, 70, 70);
		button8.setVisible(true);
		frame.add(button8);
		button8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button8.getText());
				
			}
			
		});
		
		JButton button9 = new JButton("9");
		button9.setBounds(230, 150, 70, 70);
		button9.setVisible(true);
		frame.add(button9);
		button9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button9.getText());
				
			}
			
		});
		
		JButton button4 = new JButton("4");
		button4.setBounds(50, 240, 70, 70);
		button4.setVisible(true);
		frame.add(button4);
		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button4.getText());
				
			}
			
		});
		
		JButton button5 = new JButton("5");
		button5.setBounds(140, 240, 70, 70);
		button5.setVisible(true);
		frame.add(button5);
		button5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button5.getText());
				
			}
			
		});
		
		JButton button6 = new JButton("6");
		button6.setBounds(230, 240, 70, 70);
		button6.setVisible(true);
		frame.add(button6);
		button6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button6.getText());
				
			}
			
		});
		
		JButton button1 = new JButton("1");
		button1.setBounds(50, 330, 70, 70);
		button1.setVisible(true);
		frame.add(button1);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button1.getText());
				
			}
			
		});
		
		JButton button2 = new JButton("2");
		button2.setBounds(140, 330, 70, 70);
		button2.setVisible(true);
		frame.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button2.getText());
				
			}
			
		});
		
		JButton button3 = new JButton("3");
		button3.setBounds(230, 330, 70, 70);
		button3.setVisible(true);
		frame.add(button3);
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button3.getText());
				
			}
			
		});
		
		JButton clear = new JButton("C");
		clear.setBounds(50, 420, 70, 70);
		clear.setVisible(true);
		frame.add(clear);
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText("0");
				
			}
			
		});
		
		
		JButton button0 = new JButton("0");
		button(button0,140,420,70,70,frame);
		button0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText(button0.getText());
				
			}
			
		});
		
		JButton buttonequal = new JButton("=");
		button(buttonequal,230,420,70,70,frame);
		buttonequal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton plusbutton = new JButton("+");
		button(plusbutton,320,150,70,70,frame);
		plusbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton minusbutton = new JButton("-");
		button(minusbutton,320,240,70,70,frame);
		minusbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton multbutton = new JButton("*");
		button(multbutton,320,330,70,70,frame);
		multbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton divbutton = new JButton("/");
		button(divbutton,320,420,70,70,frame);
		divbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton backspace = new JButton("<-");
		button(backspace,410,150,70,70,frame);
		backspace.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
	}
	
	public static void button(JButton jb,int x,int y,int w,int h,JFrame frame) {
		
		jb.setBounds(x,y,w,h);
		jb.setVisible(true);
		frame.add(jb);
			
	}

}
