package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.learning.App;

public class AppTest {

	@Test
	public void Login1() {
		App myApp = new App();
		Assert.assertEquals(0, myApp.userLogin("abcd", "abc@@123"));
	}
	@Test
	public void Login2() {
		App myApp = new App();
		Assert.assertEquals(1, myApp.userLogin("abc", "abc@123"));
	}
	
}
