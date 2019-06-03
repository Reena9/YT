package org.testing.Assert;

import org.testing.utilities.Logs;

public class Assert1 {
	
	
	public static boolean compare(String expected, String actual)
	{
		if(actual.equals(expected))
		{	
			
			System.out.println("matched");
			
			Logs.takelogs("TC1", "Match");
		return true;
		}
	else
	{
		Logs.takelogs(" ", "Not Match");
	
  return false;
}
}
}