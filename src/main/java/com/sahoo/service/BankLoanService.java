package com.sahoo.service;


public class BankLoanService {

	public float calcSimpleIntrestAmount(float pamt, float roi, float time)
	{
		System.out.println("BankLoanService.calcSimpleIntrestAmount()");
		if(pamt<=0 || roi<=0 | time<=0)
			throw new IllegalArgumentException("Invalid Input");
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return pamt*roi*time/100.0f;
	}
}
