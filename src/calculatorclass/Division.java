package calculatorclass;

public class Division {
	public double Divide(double fst, double sec) {
		
		if(sec == 0) {
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
			return fst/sec;
	}


}
