package com.mytests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases
{
// hard assertion : if a test case is fAILED immidiatly test case marked as failed	
	
//soft assertion:if a test case is fAILED immidiatly test case  marked as passed	 and continue next test cases
	//AssertAll() to mark test case as failed if any soft assertion is failed
@Test
public void test()
{  SoftAssert softassert=new SoftAssert();
	System.out.println("open browser");
	Assert.assertEquals(true, true);
	System.out.println("enter user name");
	System.out.println("enter password");
	System.out.println("click on sign in button");
	Assert.assertEquals(true, true);
	System.out.println("validate home page");
	
	//Assert.assertEquals(true, false);//hard assertions means it will terminate not excecute remaning test cases
	softassert.assertEquals(true, false,"home page title  is missing");//soft assertion
	System.out.println("go to deals page");
	System.out.println("create deal");
	softassert.assertEquals(true, false,"can not create deal");//soft assertion
	System.out.println("go to contact page");
	System.out.println("create a contact");
	softassert.assertEquals(true, false,"can not create contact");//soft assertion
     softassert.assertAll();//
}
@Test
public void test2()
{  
	SoftAssert softassert1=new SoftAssert();
	System.out.println("logout");
	softassert1.assertEquals(true, false,"can not  logout");//soft assertion	
	softassert1.assertAll();
}

}
