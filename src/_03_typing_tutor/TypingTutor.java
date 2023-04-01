package _03_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTutor {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	char currentLetter;
	JLabel label = new JLabel();
	public static void main(String[] args) {
		
	}
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	void setup(){
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		currentLetter = generateRandomLetter();
		frame.add(panel);
		panel.add(label);
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
	}
}
