package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatinTranslatorRunner implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton speak1 = new JButton();
	static JTextField text1 = new JTextField(20);
	static JButton button1 = new JButton();
	static JButton button2 = new JButton();
	static JTextField text2 = new JTextField(20);
	static JButton speak2 = new JButton();
	static PigLatinTranslator pig = new PigLatinTranslator();
public void showFrame() {
	frame.setTitle("Pig Latin Translator");
	frame.add(panel);
	speak1.setText("Speak");
	speak1.addActionListener(this);
	panel.add(speak1);
	text1.setSize(100, 10);
	panel.add(text1);
	button1.setText(">>");
	button1.addActionListener(this);
	panel.add(button1);
	button2.setText("<<");
	button2.addActionListener(this);
	panel.add(button2);
	text2.setSize(100, 10);
	panel.add(text2);
	speak2.setText("Speak");
	speak2.addActionListener(this);
	panel.add(speak2);
	frame.pack();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String[] args) {
	PigLatinTranslatorRunner pig1 = new PigLatinTranslatorRunner();
	pig1.showFrame();
}
public void actionPerformed(ActionEvent e) {
	if(speak1 == e.getSource()) {
		Sound.speak(text1.getText());
	}
	if(button1 == e.getSource()) {
		text2.setText("" + pig.translateEnglishToPigLatin(text1.getText()));
	}
	if(button2 == e.getSource()) {
		text1.setText("" + pig.translatePigLatinToEnglish(text2.getText()));
	}
	if(speak2 == e.getSource()) {
		Sound.speak(text2.getText());
	}
	frame.pack();
}
}
