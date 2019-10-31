package calculatorclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test
	public void checkMultiplication() {
		
		Multiplication sub = new Multiplication();
		assertEquals(12.0,sub.Multiply(6.0, 2.0),0);
			
	}

}
