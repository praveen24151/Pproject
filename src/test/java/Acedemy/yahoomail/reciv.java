package Acedemy.yahoomail;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import sender.yahooreciver;

public class reciv {
	
	@Test
	public void  yahoorecTest() throws InterruptedException, AWTException, IOException{
		yahooreciver yr=new yahooreciver();
		yr.mailreciv();
		
	}

}
