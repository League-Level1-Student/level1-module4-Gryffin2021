package _10_slot_machine;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JButton spin = new JButton();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	static Random ran = new Random();

	public static void main(String[] args) throws MalformedURLException {
		slotMachine sl = new slotMachine();
		sl.run();
	}

	public void run() throws MalformedURLException {
		frame.setLayout(new GridLayout());
		frame.add(spin);
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		spin.addActionListener(this);
		frame.setVisible(true);
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int r = ran.nextInt(2);
		if (r == 0) {
			try {
				panel1.add(createLabelImage("bar1.png"));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (r == 1) {
			try {
				panel1.add(createLabelImage("cherry1.png"));
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
		try {
			panel1.add(createLabelImage("seven.png"));
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
}
	}
	}}
