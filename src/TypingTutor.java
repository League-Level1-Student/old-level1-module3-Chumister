import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	private JFrame frame = new JFrame();
	private JLabel label = new JLabel();
	private Color red = new Color(255, 0, 0);
	private Color blue = new Color(0, 0, 255);
	private char currentLetter = generateRandomLetter();

	public static void main(String[] args) {
		new TypingTutor().start();
	}

	private void start() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Just Type!");
		frame.setSize(350, 350);
		frame.add(label);
		frame.addKeyListener(this);
		label.setText("" + currentLetter);
		label.setFont(label.getFont().deriveFont(78.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		if (currentLetter == e.getKeyChar()) {

			System.out.println("Correct");
			label.setOpaque(true);
			label.setBackground(blue);
		} else {
			label.setBackground(red);
		}
		frame.repaint();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You typed: " + e.getKeyChar());

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(" " + currentLetter);
	}

}
