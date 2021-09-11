import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

public class Calculator {
	
	static JLabel text_feild;
	static Boolean numberKeysClicked = false;
	static Boolean equaltokeyclicked = false;
	static String oldNum ;
	static String operand;
	
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
		button(button7,50, 150, 70, 70,frame);
		
		JButton button8 = new JButton("8");
		button(button8,140, 150, 70, 70,frame);
		
		JButton button9 = new JButton("9");
		button(button9,230, 150, 70, 70,frame);
		
		JButton button4 = new JButton("4");
		button(button4,50, 240, 70, 70,frame);
		
		JButton button5 = new JButton("5");
		button(button5,140, 240, 70, 70,frame);
		
		JButton button6 = new JButton("6");
		button(button6,230, 240, 70, 70,frame);
		
		JButton button1 = new JButton("1");
		button(button1,50, 330, 70, 70,frame);
		
		JButton button2 = new JButton("2");
		button(button2,140, 330, 70, 70,frame);
		
		
		JButton button3 = new JButton("3");
		button(button3,230, 330, 70, 70,frame);
		
		JButton clear = new JButton("C");
		clear.setBounds(50, 420, 70, 70);
		clear.setVisible(true);
		frame.add(clear);
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				text_feild.setText("0");
				numberKeysClicked=false;
				
			}
			
		});
		
		
		JButton button0 = new JButton("0");
		zerodotbutton(button0,140,420,70,70,frame);
		
		
		JButton buttonequal = new JButton("=");
		eqbutton(buttonequal,230,420,70,70,frame);
		
		JButton plusbutton = new JButton("+");
		opbutton(plusbutton,320,150,70,70,frame);
		plusbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton minusbutton = new JButton("-");
		opbutton(minusbutton,320,240,70,70,frame);
		minusbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton multbutton = new JButton("*");
		opbutton(multbutton,320,330,70,70,frame);
		multbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton divbutton = new JButton("/");
		opbutton(divbutton,320,420,70,70,frame);
		divbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//text_feild.setText(button7.getText());
				
			}
			
		});
		
		JButton backspace = new JButton("<-");
		bsbutton(backspace,410,150,70,70,frame);
		
		JButton dotbutton = new JButton(".");
		zerodotbutton(dotbutton,410,240,70,70,frame);
		
	}
	
	public static void button(JButton jb,int x,int y,int w,int h,JFrame frame) {
		
		jb.setBounds(x,y,w,h);
		jb.setVisible(true);
		frame.add(jb);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				if(numberKeysClicked) {
					text_feild.setText(text_feild.getText() + jb.getText());
				}
				else {
					text_feild.setText(jb.getText());
					
				}
				
				numberKeysClicked = true;
				
			}
			
		});
			
	}
	
public static void opbutton(JButton jb,int x,int y,int w,int h,JFrame frame) {
		
		jb.setBounds(x,y,w,h);
		jb.setVisible(true);
		frame.add(jb);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(equaltokeyclicked && text_feild.getText().isEmpty()==false) {
					numberKeysClicked=true;
					
				}
				
				if(numberKeysClicked) {
					
					oldNum=text_feild.getText();
					//text_feild.setText("0");
					if(jb.getText()=="+") {
						operand = "+";
					}
					else if (jb.getText()=="-") {
						operand = "-";
					}
					else if (jb.getText()=="*") {
						operand = "*";
					}
					else if (jb.getText()=="/") {
						operand = "/";
					}
					
					numberKeysClicked=false;
					
				}
				else {
					text_feild.setText("0");
				}
				
			}
			
		});
				
}

public static void bsbutton(JButton jb,int x,int y,int w,int h,JFrame frame) {
	
	jb.setBounds(x,y,w,h);
	jb.setVisible(true);
	frame.add(jb);
	jb.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			String text = text_feild.getText();
			try{
			    if(!text.isEmpty()){
			        text_feild.setText(text.substring(0, text.length()-1));
			    }
			}catch(NullPointerException e1){
			    text_feild.setText("");
			}
			
		}
		
	});
	
}

public static void eqbutton(JButton jb,int x,int y,int w,int h,JFrame frame) {
	
	jb.setBounds(x,y,w,h);
	jb.setVisible(true);
	frame.add(jb);
	jb.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			float newnumber;
			float oldnumber;
		    float total;
		
	            newnumber = Float.parseFloat(text_feild.getText());
	            oldnumber = Float.parseFloat(oldNum);
	        
			if(operand=="+") {
				
				total = newnumber+oldnumber;
				String s=Float.toString(total);
				text_feild.setText(s);
				
			}
			else if (operand=="-") {
				total = oldnumber-newnumber;
				String s=Float.toString(total);
				text_feild.setText(s);
				
			}
            else if (operand=="*") {
            	total = newnumber*oldnumber;
            	String s=Float.toString(total);
				text_feild.setText(s);
				
			}
            else if (operand=="/") {
            	
            	total = oldnumber/newnumber;
            	String s=Float.toString(total);
				text_feild.setText(s);
				
			}
			numberKeysClicked=false;
			equaltokeyclicked=true;
		}
		
	});

	
}

public static void zerodotbutton(JButton jb,int x,int y,int w,int h,JFrame frame) {
	
	jb.setBounds(x,y,w,h);
	jb.setVisible(true);
	frame.add(jb);
	jb.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			if(numberKeysClicked) {
				text_feild.setText(text_feild.getText() + jb.getText());
			}
			else {
				text_feild.setText(jb.getText());
				
			}
			
			//numberKeysClicked = true;
			
		}
		
	});
		
}



}
