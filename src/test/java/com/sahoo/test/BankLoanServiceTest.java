package com.sahoo.test;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.sahoo.service.BankLoanService;

public class BankLoanServiceTest {

	@Test
	public void calcSimpleIntrestAmountTestWithSmallAmount()
	{
		BankLoanService service = new BankLoanService();
		float actual = service.calcSimpleIntrestAmount(100000, 5, 2);
		float expected = 10000;
		Assertions.assertEquals(expected, actual, "may be result not matching");
	}
	@Test
	public void calcSimpleIntrestAmountTestWithBigAmount()
	{
		BankLoanService service = new BankLoanService();
		float actual = service.calcSimpleIntrestAmount(600000, 5, 2);
		float expected = 60000;
		Assertions.assertEquals(expected, actual,"may be result not matching");
	}
	@Test
	public void calcSimpleIntrestAmountTestWithInvalidInput()
	{
		BankLoanService service = new BankLoanService();
		 Assertions.assertThrows(IllegalArgumentException.class, ()->{
			 service.calcSimpleIntrestAmount(0, 0, 0);
			 
		 },"may be exception not matching");
	}
	
	@Test
	public void calcSimpleIntrestAmountTestWithPerformanceTimer()
	{
		BankLoanService service = new BankLoanService();
		 Assertions.assertTimeout(Duration.ofMillis(6000), ()->{
			 service.calcSimpleIntrestAmount(1000000, 5, 2);
		 });
	}
	@Test
	public void calcSimpleIntrestAmountTestNoExceptionForPositiveInput()
	{
		BankLoanService service = new BankLoanService();
		 Assertions.assertDoesNotThrow(()->{
			 service.calcSimpleIntrestAmount(900000, 10, 2);
		 });
	}
}
