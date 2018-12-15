package extra;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
public static void main(String[] args) throws IOException {
	frame.setVisible(true);
	SlotMachine s = new SlotMachine();

	panel.add(button);
	panel.add(button2);
	s.createUI();
cherry=s.createLabelImage("cherry.jpeg");
orange = s.createLabelImage("orange.jpg");
lime = s.createLabelImage("lime.jpg");
panel.add(cherry);
panel.add(orange);
panel.add(lime);
frame.add(panel);
}
static JFrame frame = new JFrame();
static JPanel panel = new JPanel();
static JLabel label = new JLabel();
static JLabel cherry = new JLabel();
static JLabel lime = new JLabel();
static JLabel orange = new JLabel();
static JButton button = new JButton("Start spinning");
static JButton button2 = new JButton("Stop");
private String buttonPressed;

void createUI() throws IOException {
	button.addActionListener(this);
	if (buttonPressed =="Start spinning") {
		
	}
}
private JLabel createLabelImage(String fileName)
		throws MalformedURLException
{
	URL imageURL = getClass().getResource(fileName);
	if (imageURL == null)
	{
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
	
}

}
