package ee.tty.praktikum2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testing {
	Calc calc;
	
	@Test
	public void testJunior() {
		assertEquals(70, Calc.payJunior(1, 7));
	}
	
	@Test
	public void testJuniorOverHour() {
		assertEquals(100, Calc.payJunior(1, 9));
	}
	
	@Test
	public void testJuniorOverTwentyHours() {
		assertEquals(350, Calc.payJunior(1, 21));
	}

	@Test
	public void testSenior() {
		assertEquals(105, Calc.paySenior(2, 7));
	}
	
	@Test
	public void testSeniorOverHour() {
		assertEquals(150, Calc.paySenior(2, 9));
	}
	
	@Test
	public void testSeniorOverTwentyHours() {
		assertEquals(530, Calc.paySenior(2, 21));
	}
	
	@Test
	public void testSpecialist() {
		assertEquals(154, Calc.paySpecialist(3, 7));
	}
	
	@Test
	public void testSpecialistOverHour() {
		assertEquals(264, Calc.paySpecialist(3, 10));
	}
	
	@Test
	public void testSpecialistOverTwentyHours() {
		assertEquals(1020, Calc.paySpecialist(3, 21));
	}
}
