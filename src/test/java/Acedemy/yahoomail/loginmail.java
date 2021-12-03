package Acedemy.yahoomail;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import sender.yahoomail;

public class loginmail {
	
	@Test
	public void verifyTest() throws InterruptedException, AWTException, IOException {
		
	yahoomail y= new yahoomail();
	y.sender();
	
	
	

}
}
