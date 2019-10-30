package calculatorclass;
import static org.junit.Assert.*;
import org.junit.Test;

public class SubtractionTest {
	@Test
	public void checkSubtraction(){
		Subtraction sub = new Subtraction();
		assertEquals(4.0,sub.Subtract(6.0, 2.0),0);
		
	}
	

}
