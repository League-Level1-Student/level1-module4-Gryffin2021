package _06_calculator;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator implements ActionListener {
	JButton addbutton = new JButton();
	JButton subbutton = new JButton();
	JButton mulbutton = new JButton();
	JButton divbutton = new JButton();
	JTextField text1 = new JTextField();
	JTextField text2 = new JTextField();
	JLabel putout = new JLabel();
		public static void main(String[] args) {
			Calculator number = new Calculator();
			number.drawCalculator();
	}
	public void drawCalculator() {
		JFrame frame = new JFrame();
		frame.setSize(600,800);
		frame.setTitle("Simple Calculator");
		addbutton.addActionListener(this);
		subbutton.addActionListener(this);
		mulbutton.addActionListener(this);
		divbutton.addActionListener(this);
		frame.add(text1);
		frame.add(text2);
		addbutton.setText("Add");
		subbutton.setText("Subtract");
		mulbutton.setText("Multiply");
		divbutton.setText("Divide");
		frame.add(addbutton);
		frame.add(subbutton);
		frame.add(mulbutton);
		frame.add(divbutton);
		frame.setVisible(true);
		frame.setLayout(new GridLayout());
		frame.add(putout);
		frame.pack();
	}
	
	public void add() {
		double t1 = Double.parseDouble(text1.getText());
		double t2 = Double.parseDouble(text2.getText());
		putout.setText("" + (t1 + t2));
	}
	public void sub() {
		double t1 = Double.parseDouble(text1.getText());
		double t2 = Double.parseDouble(text2.getText());
		putout.setText("" + (t1 - t2));
	}
	public void mul() {
		double t1 = Double.parseDouble(text1.getText());
		double t2 = Double.parseDouble(text2.getText());
		putout.setText("" + (t1 * t2));
	}
	public void div() {
		double t1 = Double.parseDouble(text1.getText());
		double t2 = Double.parseDouble(text2.getText());
		putout.setText("" + (t1/t2));
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(addbutton)) {
			add();
		}
		if(e.getSource().equals(subbutton)) {
			sub();
		}
		if(e.getSource().equals(mulbutton)) {
			mul();
		}
		if(e.getSource().equals(divbutton)) {
			div();
		}
	}
}
