package assignment2;

public class Sinus implements Sampler {

	private double t, dt;
	
	public Sinus(double start, double deltaT){
		t = start;
		dt = deltaT;
	}
	
	public double read() {
		double x = t;
		t += dt;
		return (2 + Math.sin(x)) * 30;
	}

}
