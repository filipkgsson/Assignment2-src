package assignment2;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PresenterTester {
	
	public static void main(String[] args) {
		Presenter p = new ImagePresenter();
		PresenterFrame pf = new PresenterFrame(p);
		String[] filenames = {"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"};
		((ImagePresenter)p).setFilenames(filenames);
		((ImagePresenter)p).setText(filenames);
		pf.setVisible(true);
	}
	
	/*public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		BufferedImage img;
		try {
			img = ImageIO.read(new File("1.jpg"));
		} catch (IOException e) {
			throw new RuntimeException("File could not be opened");
		}
		label.setIcon(new ImageIcon(img));
		label.repaint();
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}*/
	
}
