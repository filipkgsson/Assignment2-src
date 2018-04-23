package assignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PresenterFrame extends JFrame{
	
	public PresenterFrame(Presenter p) {
		JButton west = new JButton("West");
		JButton east = new JButton("East");
		JButton[] buttons = new JButton[2];
		buttons[0] = west;
		buttons[1] = east;
		east.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((e.getSource()).equals(buttons[0]))
					p.westButtonPressed();
				else
					p.eastButtonPressed();
			}
		});
		west.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((e.getSource()).equals(buttons[0]))
					p.westButtonPressed();
				else
					p.eastButtonPressed();
			}
		});
		p.setButtons(buttons);
		JLabel label = new JLabel();
		label.setPreferredSize(new Dimension(100, 200));
		p.setLabel(label);
		JPanel panel = new JPanel();
		panel.add(west);
		panel.add(east);
		panel.add(label);
		this.setPreferredSize(new Dimension(500, 500));
		setLayout(new BorderLayout());
		add(((ImagePresenter)p).getImageLabel(), BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setVisible(true);
	}
}
