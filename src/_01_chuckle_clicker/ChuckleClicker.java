package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JButton joke = new JButton();
	JButton punchline = new JButton();
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
		}
	public void makeButtons(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		joke.setText("Joke");
		punchline.setText("Punchline");
		joke.addActionListener(this);
		punchline.addActionListener(this);
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		if(buttonPressed == joke) {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
		}
		if(buttonPressed == punchline) {
			JOptionPane.showMessageDialog(null, "To get to the KFC!");
		}
		
	}
}
