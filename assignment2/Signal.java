package assignment2;

import java.util.ArrayList;
import javax.swing.Timer;

public class Signal {

	private double amplitude;
	private final int SAMPLING = 1000;
	private ArrayList<SignalObserver> theObservers;
	private Sampler theSampler;

	public Signal() {
		theSampler = new DefaultSampler();
		theObservers = new ArrayList<SignalObserver>();
		Timer t = new Timer(SAMPLING, e -> nextValue(theSampler.read()));
		t.start();
	}
	
	public void setTheSampler(Sampler aSampler) {
		theSampler = aSampler;
	}

	public void addSignalObserver(SignalObserver s) {
		theObservers.add(s);
	}

	private void nextValue(double x) {
		amplitude = x;
		for (SignalObserver so : theObservers)
			so.updateSignal(amplitude);
	}
}
