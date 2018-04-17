package assignment2;

public class FilterDemo extends Filter {

	public boolean accept(String x) {
		if (x.length() > 3)
			return false;
		else
			return true;
	}

	public String[] filter(String[] x) {
		String[] temp = new String[x.length];
		int j = 0;
		for(int i = 0; i < x.length; i++)
			if(this.accept(x[i])) {
				temp[j] = x[i];
				j++;
			}
		String[] result = new String[j]; 
		System.arraycopy(temp, 0, result, 0, j);
		return result;
	}

	public static void main(String[] args) {
		FilterDemo fd = new FilterDemo();
		String[] x = {"HEj", "Simon", "på", "dig", "svenska"};
		String[] result = fd.filter(x);
		for(String s : result)
			System.out.println(s);
	}
}