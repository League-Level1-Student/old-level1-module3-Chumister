import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
ChuckleClicker melee = new ChuckleClicker();
melee.createGUI();
}
	JButton brawl = new JButton();
	JButton ultimate = new JButton();

	 void createGUI() {
		 JPanel N64 = new JPanel();
		 JFrame U= new JFrame();
		U.add(N64);
		U.setVisible(true);
		N64.setSize(500,500);
		brawl.addActionListener(this);
		ultimate.addActionListener(this);
		N64.add(brawl);
		N64.add(ultimate);
		brawl.setSize(50,50);
		ultimate.setSize(50,50);

		brawl.setVisible(true);		
		ultimate.setVisible(true);
		brawl.setText("joke");
		ultimate.setText("punchline");

		N64.setVisible(true);
		U.pack();
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if ((JButton)e.getSource() == brawl) {
			JOptionPane.showMessageDialog(null, "life");
		}
		else {
			
		JOptionPane.showMessageDialog(null, "hi");
		}
	}
}
