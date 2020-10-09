package Listners;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenersDemo2 {

	@Test
	public void test3(){
		System.out.println("this is test 3");
	}
	
	@Test
	public void test4(){
		System.out.println("this is test 4");
		
	}
	
	@Test
	public void test5(){
		System.out.println("this is test 5");
		throw new SkipException("this is skipped");
		}
	
}
