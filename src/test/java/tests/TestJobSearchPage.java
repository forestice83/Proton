package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class TestJobSearchPage extends TestBase {
	
//		public void dummyTest(){
//		jobSearchPage.jobSearchButton;
//		}		

	@Test
	public void texstNewJobCount() {
		String job = jobSearchPage.totalJobWebElement.getText();
		
		Assert.assertEquals(job, "500");
	}
	
}
