package assignment2;

public class SignalTest {
	public static void main(String[] args) {
		Signal s = new Signal();
		s.addSignalObserver(new SignalWindow());
		s.addSignalObserver(new SignalObserver() {
			public void updateSignal(double x) {
				printStars((int) x);
			}
		});
		s.setTheSampler(new Sinus(0.0, 1.0));
	}

	private static void printStars(int x) {
		for (int i = 0; i < x; i++)
			System.out.print("*");
		System.out.println();
	}
}
