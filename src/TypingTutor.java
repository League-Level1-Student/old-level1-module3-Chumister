import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor implements KeyListener {
	static char currentLetter;
	JLabel Bumper = new JLabel();

public static void main(String[] args) {
	TypingTutor t = new TypingTutor();
	t.method();

}

 void method() {
	 JFrame Trigger=new JFrame();
		currentLetter = generateRandomLetter();
		Bumper.setFont(Bumper.getFont().deriveFont(28.0f));
		Bumper.setHorizontalAlignment(Bumper.CENTER);
		Trigger.addKeyListener(this);
}
private static char generateRandomLetter() {
	// TODO Auto-generated method stub
	Random r = new Random();
	return (char) (r.nextInt(26)+'a');
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
e.getKeyCode();	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

}
