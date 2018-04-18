package assignment2;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public abstract class Presenter extends JApplet implements ActionListener{
	
	private JButton[] buttons;
	private JLabel label;
	
	public Presenter() {
		JFrame frame = new JFrame();
		JButton west = new JButton("West");
		JButton east = new JButton("East");
		buttons = new JButton[2];
		buttons[0] = west;
		buttons[1] = east;
		label = new JLabel();
		label.setPreferredSize(new Dimension(100, 200));
		JPanel panel = new JPanel();
		panel.add(west);
		panel.add(east);
		panel.add(label);
		frame.setLayout(new BorderLayout());
		frame.add(createCenterComponent(), BorderLayout.NORTH);
		frame.add(panel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

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