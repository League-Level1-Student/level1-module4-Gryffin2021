package _09_whack_a_mole;

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.util.Date;
import java.util.Random;

import javax.swing.*;

public class WhackAMole implements ActionListener {
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	static JButton[] buttons = new JButton[24];
	static Random ran = new Random();
	static int mole = 0;
	static int count = 0;
	static int miss = 0;
	static Date date = Date.from(Instant.now());

	public static void main(String[] args) {
		WhackAMole wam = new WhackAMole();
		wam.run();
	}

	public void run() {
		frame.setTitle("Whack-a-Mole");
		frame.setLayout(new GridLayout());
		frame.add(panel);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}
		mole = ran.nextInt(buttons.length);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		for (int i = 0; i < buttons.length; i++) {
			if (i == mole) {
				buttons[i].setText("Mole");
			} else {
				buttons[i].setText("");
			}
		}
		if (count == 10) {
			speak("You Win!");
			endGame(date, count);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(buttons[mole])) {
			count++;
			playSound("ding.mp3");
			speak("Hit!");
			panel.removeAll();
			run();
		} else {
			miss++;
			if (miss == 1) {
				speak("Miss!");
			}
			if (miss == 2) {
				speak("Missed Again!");
			}
			if (miss == 3) {
				speak("How could you miss again?!");
			}
			if (miss == 4) {
				speak("You really suck at this.");
			}
			if (miss == 5) {
				speak("That's it! I'm ending the game!");
				endGame(date, count);
			}
		}

	}

	static void speak(String words) {
		if (System.getProperty("os.name").contains("Windows")) {
			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
					+ words + "');\"";
			try {
				Runtime.getRuntime().exec(cmd).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				Runtime.getRuntime().exec("say " + words).waitFor();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ (((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00) / molesWhacked) + " moles per second.");
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}
}
