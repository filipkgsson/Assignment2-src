package assignment2;

import java.awt.Dimension;

public class PresenterTester {

	public static void main(String[] args) {
		Presenter p = new ImagePresenter();
		PresenterFrame pf = new PresenterFrame(p);
		String[] filenames = { "1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg" };
		((ImagePresenter) p).setFilenames(filenames);
		((ImagePresenter) p).setText(filenames);
		pf.setSize(new Dimension(500,500));
		pf.setVisible(true);
	}
}
