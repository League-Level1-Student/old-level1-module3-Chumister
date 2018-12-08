import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends MouseAdapter {
	public static void main(String[] args) {
		new Calculator().start();
	}

	private void start() {
		// TODO Auto-generated method stub

	}

	JFrame Pearl = new JFrame();
	JPanel Marina = new JPanel();
	JButton add = new JButton();
	JButton sub = new JButton();
	JButton mul = new JButton();
	JButton div = new JButton();
	JTextField first = new JTextField(4);
	JTextField second = new JTextField(4);

	Calculator() {

		first.setSize(100, 100);
		Marina.add(first);

		second.setSize(100, 100);
		Marina.add(second);

		add.setText("Add");
		Marina.add(add);
		sub.setText("Substract");
		Marina.add(sub);
		mul.setText("Multiply");
		Marina.add(mul);
		div.setText("Divide");
		Marina.add(div);
		Pearl.add(Marina);
		Pearl.setVisible(true);
		Pearl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Pearl.pack();
		add.addMouseListener(this);
		sub.addMouseListener(this);
		mul.addMouseListener(this);
		div.addMouseListener(this);
	}

	double add(double first, double second) {
		return first + second;
	}

	double sub(double first, double second) {
		return first - second;
	}

	double mul(double first, double second) {
		return first * second;
	}

	double div(double first, double second) {
		return first / second;
	}

	public void mousePressed(MouseEvent e) {
		if (e.getSource().equals(add)) {
			JOptionPane.showMessageDialog(null,
					add(Double.parseDouble(first.getText()), Double.parseDouble(second.getText())));
		}
		if (e.getSource().equals(sub)) {
			JOptionPane.showMessageDialog(null,
					sub(Double.parseDouble(first.getText()), Double.parseDouble(second.getText())));
		}
		if (e.getSource().equals(mul)) {
			JOptionPane.showMessageDialog(null,
					mul(Double.parseDouble(first.getText()), Double.parseDouble(second.getText())));
		}
		if (e.getSource().equals(div)) {
			JOptionPane.showMessageDialog(null,
					div(Double.parseDouble(first.getText()), Double.parseDouble(second.getText())));
		}
	}

}