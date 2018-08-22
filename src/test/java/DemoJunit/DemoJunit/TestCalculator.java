package DemoJunit.DemoJunit;

import static org.junit.Assert.*;
import java.security.Provider.Service;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class TestCalculator 
{

	Calculator c= null;
	
	//By using the stub dummy or fake object 
	// here the fake object is Service
	CalculatorService service = new CalculatorService() {
		
		public int add(int i, int j) {
			// TODO Auto-generated method stub
			return i+j;
		}
	};
	
	
	
	
	@Before
	public void setUp()
	{
		c = new Calculator(service);
	}
	
	
	
	@Test
	public void testAdd()
	{
		assertEquals(10,c.perform(2, 3));
	}
			
}
