package assignment2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class ImagePresenter extends Presenter {

	private BufferedImage img;
	private JLabel imagelabel;
	private String[] filenames;
	private String[] texts;
	private int count = -1;
	
	public ImagePresenter() {
		imagelabel = createCenterComponent();
	}
	
	public void setFilenames(String[] fn) {
		filenames = fn;
	}
	
	public void setText(String[] s) {
		texts = s;
	}
	
	public void showImage(String filename){
		try {
			img = ImageIO.read(new File(filename));
		} catch (IOException e) {
			throw new RuntimeException("File could not be opened");
		}
		imagelabel.setIcon(new ImageIcon(img));
		imagelabel.repaint();
	}

	public JLabel createCenterComponent() {
		JLabel l = new JLabel();
		l.setPreferredSize(new Dimension(100, 200));
		return l;
	}

	public void eastButtonPressed() {
		count ++;
		if(count == filenames.length)
			count --;
		showText(texts[count]);
		showImage(filenames[count]);
	}

	public void westButtonPressed() {
		count --;
		if(count < 0)
			count = 0;
		showText(texts[count]);
		showImage(filenames[count]);
	}
	
	public JLabel getImageLabel() {
		return imagelabel;
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}

/*
 * We have defined the constructor ImagePresenter, setFilenames, setText, showImage, createCenterComponent, eastButtonPressed,
 * westButtonPressed and getImageLabel in the file ImagePresenter.java.
 * In the file Presenter.java we have defined showText, setButton and setLabel.
 * We have defined the file PresenterFrame.java
 */
