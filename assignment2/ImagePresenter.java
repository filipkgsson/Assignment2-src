package assignment2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePresenter extends Presenter {

	private BufferedImage img;
	private JLabel label;
	private String[] filenames;
	
	public void setFilenames(String[] fn) {
		filenames = fn;
	}
	
	public void showImage(String filename){
		try {
			img = ImageIO.read(new File(filename));
		} catch (IOException e) {
			throw new RuntimeException("File could not be opened");
		}
		label = createCenterComponent();
		label.setIcon(new ImageIcon(img));
		label.repaint();
	}

	public JLabel createCenterComponent() {
		JLabel l = new JLabel();
		l.setPreferredSize(new Dimension(100, 200));
		return l;
	}

	public void eastButtonPressed() {
		String temp = ;
		
		showImage(filenames[i]);
		
	}

	public void westButtonPressed() {
		i++;
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}
