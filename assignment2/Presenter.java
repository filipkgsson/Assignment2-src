package assignment2;

import java.awt.event.*;
import javax.swing.*;

public abstract class Presenter extends JApplet implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	public abstract JComponent createCenterComponent();

	public void showText(String text) {
	}

	//public abstract void northButtonPressed();

	public abstract void eastButtonPressed();

	//public abstract void southButtonPressed();

	public abstract void westButtonPressed();
	
}