package demo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestngDependency {

	
	@Test(dependsOnMethods = {"test2"},priority=0)
	public void test1() {
		System.out.println("test 1");
	}

	@Test(priority=1)
	public void test2() {
		System.out.println("test 2");
	}

	@Ignore
	@Test
	public void test3() {
	System.out.println("test 3");
	}





}


