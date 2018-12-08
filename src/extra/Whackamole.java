package extra;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Whackamole implements ActionListener {
	static Date d;
	public static void main(String[] args) {
		Whackamole j = new Whackamole();
		j.createUI();
 d = new Date();


	}

	void createUI() {
		Random Van = new Random();
		int r = Van.nextInt(25);
		for (int i = 1; i < 25; i++) {
			JButton mole = new JButton();
			if (i==r) {
				mole.setText("Mole!");
				
			}
			panel.add(mole);
			mole.addActionListener(this);
		}
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.add(panel);

	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	
	static JFrame frame = new JFrame();
	static JPanel panel = new JPanel();
	
	int countmole = 0;
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton)e.getSource();
		if (buttonPressed.getText().equals("Mole!")) {
			speak("!");
			countmole++;
			frame.dispose();
			Whackamole n = new Whackamole();
			n.createUI();

		}
		else {
			speak("You missed!");
			
		}
		
		if (countmole>10) {
			endGame(d, countmole);
		}
		
	}
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}

}
