package assignment2;

import java.awt.*;
import javax.swing.*;

public class PresenterFrame extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public PresenterFrame(Presenter p) {
		JButton west = new JButton("Prev");
		JButton east = new JButton("Next");
		JButton[] buttons = new JButton[2];
		buttons[0] = west;
		buttons[1] = east;
		east.addActionListener(p);
		west.addActionListener(p);
		((ImagePresenter)p).setButtons(buttons);
		JLabel label = new JLabel();
		label.setPreferredSize(new Dimension(100, 200));
		((ImagePresenter)p).setLabel(label);
		JPanel panel = new JPanel();
		panel.add(west);
		panel.add(east);
		panel.add(label);
		setLayout(new BorderLayout());
		add(((ImagePresenter)p).getImageLabel(), BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
