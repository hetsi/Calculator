package calculatorclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class ModulusTest {

	@Test
	public void checkModulus() {
		Modulus modulus = new Modulus();
		assertEquals(0.0,modulus.Module(6.0, 2.0),0);
	}

}
