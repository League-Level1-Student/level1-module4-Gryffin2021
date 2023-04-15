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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class slotMachine implements ActionListener {
	JFrame frame = new JFrame();
	JButton spin = new JButton();
	JPanel panel1 = new JPanel();
	JLabel label1 = new JLabel();
	JPanel panel2 = new JPanel();
	JLabel label2 = new JLabel();
	JPanel panel3 = new JPanel();
	JLabel label3 = new JLabel();
	int a = 0;
	int b = 0;
	int c = 0;
	static Random ran = new Random();

	public static void main(String[] args) throws MalformedURLException {
		slotMachine sl = new slotMachine();
		sl.run();
	}

	public void run() throws MalformedURLException {
		frame.setLayout(new GridLayout());
		spin.setText("Spin");
		frame.add(spin);
		frame.add(panel1);
		panel1.add(label1);
		frame.add(panel2);
		panel2.add(label2);
		frame.add(panel3);
		panel3.add(label3);
		spin.addActionListener(this);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
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
		int r = ran.nextInt(3);
		panel1.removeAll();
		panel2.removeAll();
		panel3.removeAll();
		if (r == 0) {
			try {

				panel1.add(createLabelImage("bar1.png"));
				a = 1;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (r == 1) {
			try {

				panel1.add(createLabelImage("cherry1.png"));
				a = 2;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.pack();
		} else {
			try {

				panel1.add(createLabelImage("seven.png"));
				a = 3;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			r = ran.nextInt(3);
		}
		if (r == 0) {
			try {

				panel2.add(createLabelImage("bar1.png"));
				b = 1;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (r == 1) {
			try {

				panel2.add(createLabelImage("cherry1.png"));
				b = 2;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.pack();
		} else {
			try {

				panel2.add(createLabelImage("seven.png"));
				b = 3;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		r = ran.nextInt(3);
		if (r == 0) {
			try {

				panel3.add(createLabelImage("bar1.png"));
				c = 1;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if (r == 1) {
			try {

				panel3.add(createLabelImage("cherry1.png"));
				c = 2;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			frame.pack();
		} else {
			try {

				panel3.add(createLabelImage("seven.png"));
				c = 3;
				frame.pack();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(a == b & a == c) {
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		}
	}
}