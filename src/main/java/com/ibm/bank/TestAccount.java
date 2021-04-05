package com.ibm.bank;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAccount {
	private Account account;
	private double ac;
	@BeforeEach
	public void setup() {
		account = new Account(1000);
	}
	@Test
	public void testDeposit() {
		assertEquals(2000, account.deposit(1000));
		//assertThrows(NumberFormatException.class,()->account.deposit(-100));
	}
	@Test 
	public void testWithdraw()   {
		assertThrows(InsufficientException.class, ()->account.withdraw(10000));
	}
	
	@Test
	public void testNegativeWithdraw() {  
		assertThrows(NumberFormatException.class,()->account.withdraw(-200));
	}
	@Test
	public void invalidDeposit() {
		assertThrows(NumberFormatException.class,()->account.deposit(-10));
	}
	
	
}
