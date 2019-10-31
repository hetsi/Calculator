package calculatorclass;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void checkDivision() {
		Division divide = new Division();
		assertEquals(3.0,divide.Divide(6.0, 2.0),0);
	}

}
