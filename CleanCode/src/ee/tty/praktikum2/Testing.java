package ee.tty.praktikum2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testing {
	Calc calc;
	
	@Before
	public void setup() {
		calc = new Calc();
	}
	
	@Test
	public void testJunior() {
		assertEquals(70, Calc.pay(1, 7));
	}
	
	@Test
	public void testJuniorOverHour() {
		assertEquals(100, Calc.pay(1, 9));
	}

	@Test
	public void testSenior() {
		assertEquals(105, Calc.pay(2, 7));
	}
	
	@Test
	public void testSeniorOverHour() {
		assertEquals(150, Calc.pay(2, 9));
	}
	
	@Test
	public void testSpecialist() {
		assertEquals(154, Calc.pay(3, 7));
	}
	
	@Test
	public void testSpecialistOverHour() {
		assertEquals(264, Calc.pay(3, 10));
	}
}
