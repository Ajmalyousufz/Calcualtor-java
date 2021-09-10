import javax.swing.*;
import javax.swing.JFrame;

public class Calculator {
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(540, 600);
		frame.setLayout(null);
		frame.setVisible(true);
		
		JButton button7 = new JButton("7");
		button7.setBounds(50, 150, 70, 70);
		button7.setVisible(true);
		frame.add(button7);
		
		JButton button8 = new JButton("8");
		button8.setBounds(140, 150, 70, 70);
		button8.setVisible(true);
		frame.add(button8);
		
		JButton button9 = new JButton("9");
		button9.setBounds(230, 150, 70, 70);
		button9.setVisible(true);
		frame.add(button9);
		
		JButton button4 = new JButton("4");
		button4.setBounds(50, 240, 70, 70);
		button4.setVisible(true);
		frame.add(button4);
		
		JButton button5 = new JButton("5");
		button5.setBounds(140, 240, 70, 70);
		button5.setVisible(true);
		frame.add(button5);
		
		JButton button6 = new JButton("6");
		button6.setBounds(230, 240, 70, 70);
		button6.setVisible(true);
		frame.add(button6);
		
		JButton button1 = new JButton("1");
		button1.setBounds(50, 330, 70, 70);
		button1.setVisible(true);
		frame.add(button1);
		
		JButton button2 = new JButton("2");
		button2.setBounds(140, 330, 70, 70);
		button2.setVisible(true);
		frame.add(button2);
		
		JButton button3 = new JButton("3");
		button3.setBounds(230, 330, 70, 70);
		button3.setVisible(true);
		frame.add(button3);
		
		JButton clear = new JButton("C");
		clear.setBounds(50, 420, 70, 70);
		clear.setVisible(true);
		frame.add(clear);
		
		
		JButton button0 = new JButton("0");
		button(button0,140,420,70,70,frame);
		
		JButton buttonequal = new JButton("=");
		button(buttonequal,230,420,70,70,frame);
		
		JButton plusbutton = new JButton("+");
		button(plusbutton,320,150,70,70,frame);
		
		JButton minusbutton = new JButton("-");
		button(minusbutton,320,240,70,70,frame);
		
		JButton multbutton = new JButton("*");
		button(multbutton,320,330,70,70,frame);
		
		JButton divbutton = new JButton("/");
		button(divbutton,320,420,70,70,frame);
		
		JButton backspace = new JButton("<-");
		button(backspace,410,150,70,70,frame);
	}
	
	public static void button(JButton jb,int x,int y,int w,int h,JFrame frame) {
		
		
		jb.setBounds(x,y,w,h);
		jb.setVisible(true);
		frame.add(jb);
		
	}

}
