package integration.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorIT {
private static Calintegrate calc;
	
	@BeforeClass
	public static void setup() {
		calc= new Calintegrate();
	}

	@Test
	public void testintegrate() {
		assertEquals(2,calc.sub(calc.add(2,2),calc.add(1,1)));
	}
	@Test
	public void testintegrate1() {
		assertEquals(1,calc.sub(calc.add(3,1),calc.add(1,2)));
	}
}
