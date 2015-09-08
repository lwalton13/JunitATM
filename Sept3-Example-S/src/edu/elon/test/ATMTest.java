/**
 * 
 */
package edu.elon.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author ewalton
 *
 */
public class ATMTest {
	private ATM atm;
	private ATM dave;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		atm = new ATM(0);
		dave = new ATM(100);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		atm = null;
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#ATM(double)}.
	 */
	@Test
	public void testATMDouble() {
		double expected =0;
		double actual = atm.getBalance();
		assertEquals(expected,actual,.01);
		
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#deposit(double)}.
	 */
	@Test
	public void testDeposit() {
		dave.deposit(15);
		double expected = 115;
		double actual = dave.getBalance();
		assertEquals(expected, actual, .01);
	}
	
	/**
	 * Test method for {@link edu.elon.test.ATM#deposit(double)}.
	 */
	@Test (expected= IllegalArgumentException.class)
	public void testDepositBad() {
		dave.deposit(-15);
		double expected = 115;
		double actual = dave.getBalance();
		assertEquals(expected, actual, .01);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#getBalance()}.
	 */
	@Test
	public void testGetBalance() {
		double expected = 0;
		double actual = atm.getBalance();
		assertEquals(expected, actual, .01);
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#toString()}.
	 */
	@Test
	public void testToString() {
		String expected = "Amount balance is $0.00";
		String actual = atm.toString();
		System.out.println(actual);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
	 */
	@Test 
	public void testWithdraw() {
		dave.withdraw(50);
		double expected = 50;
		double actual = dave.getBalance();
		assertEquals(expected, actual, .01); 
	}

	/**
	 * Test method for {@link edu.elon.test.ATM#withdraw(double)}.
	 */
	@Test (expected = IllegalArgumentException.class)
	public void testWithdrawBad() {
		dave.withdraw(115);
	}

}
