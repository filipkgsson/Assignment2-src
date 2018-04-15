package assignment2;

import javax.swing.*;

public class SignalWindow extends JFrame implements SignalObserver {

	private static final long serialVersionUID = 1L;
	private JTextArea jta;

	public SignalWindow() {
		jta = new JTextArea(100, 20);
		jta.append("The signal amplitude.\n");
		add(jta);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	public void updateSignal(double x) {
		jta.append("" + x + "\n");
	}
}