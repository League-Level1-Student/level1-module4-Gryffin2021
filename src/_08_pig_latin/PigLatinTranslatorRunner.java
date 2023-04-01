package _08_pig_latin;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslatorRunner {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JTextField text1 = new JTextField();
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JTextField text2 = new JTextField();
	static JButton speak = new JButton();
public static void main(String[] args) {
	frame.setTitle("Pig Latin Translator");
	frame.add(panel);
	text1.setSize(100, 10);
	panel.add(text1);
	button1.setText(">>");
	button1.addActionListener(null);
	panel.add(button1);
	button2.setText("<<");
	panel.add(button2);
	text2.setSize(100, 10);
	panel.add(text2);
	speak.setText("Speak");
	panel.add(speak);
	frame.pack();
	frame.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
	
}
}
