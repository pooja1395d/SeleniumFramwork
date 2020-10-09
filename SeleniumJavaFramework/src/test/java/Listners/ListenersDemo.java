package Listners;

//import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenersDemo {

	@Test(groups= {"group a"})
	public void test1(){
		System.out.println("this is test 1");
	}
	
	@Test(groups= {"group b"})
	public void test2(){
		System.out.println("this is test 2");
		Assert.assertTrue(false);
	}
	
	@Test(groups= {"group a"})
	public void test3(){
		System.out.println("this is test 3");
		throw new SkipException("this is skipped");
		}
	
}
