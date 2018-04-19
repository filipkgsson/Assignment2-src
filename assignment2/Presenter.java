package assignment2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Presenter extends JApplet implements ActionListener{

	private JButton[] buttons;
	private JLabel label;
	
	public abstract JComponent createCenterComponent();
	
	public void ActionPerformed(ActionEvent e) {
		if((e.getSource()).equals(buttons[0]))
			westButtonPressed();
		else
			eastButtonPressed();
	}

	public void showText(String text) {
		label.setText(text);
	}
	
	public void setButtons(JButton[] b) {
		buttons = b;
	}
	
	public void setLabel(JLabel l) {
		label = l;
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