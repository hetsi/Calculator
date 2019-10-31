package calculatorclass;

public class Modulus {
public double Module(double fst, double sec) {
		
		if(sec == 0) {
			throw new IllegalArgumentException("Argument 'divisor' is 0");
		}
			return fst % sec;
	}

}
