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

/*
The classes that are a part of the framework is Presenter.
The application programmer needs to define the createCenterComponent, northButtonPressed, eastButtonPressed,
southButtonPressed and westButtonPressed methods in order to create a complete application.
*/