package calculatorclass;

import static org.junit.Assert.*;
import org.junit.Test;


public class AdditionTest {

	@Test
	public void checkAddition() {
		Addition add = new Addition();
		assertEquals(-4.0,add.Add(-2.0, -2.0),0);
	
	}

}
