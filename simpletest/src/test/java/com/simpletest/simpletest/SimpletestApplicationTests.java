package com.simpletest.simpletest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpletestApplicationTests {

	@Test
	public void Test_01() {
		String phrase = "It is time to write good code";
		assertEquals("time", SimpletestApplication.findLargestWord(phrase));
	}
	
	@Test
	public void Test_02() {
		String phrase = "It is code time for sure";
		assertEquals("code", SimpletestApplication.findLargestWord(phrase));
	}
	
	@Test
	public void Test_03() {
		String phrase = "Once upon a time there was a fair";
		assertEquals("Once", SimpletestApplication.findLargestWord(phrase));
	}
	
	
	@Test
	public void Test_04() {
		String phrase = "eye blink not fast";
		assertEquals("00", SimpletestApplication.findLargestWord(phrase));
	}
	
	@Test
	public void Test_05() {
		String phrase = "It is going to be a big party";
		assertEquals("It", SimpletestApplication.findLargestWord(phrase));
	}

	@Test
	public void Test_06() {
		String phrase = "apple sugar melon avocado cookies";
		assertEquals("00", SimpletestApplication.findLargestWord(phrase));
	}
	
	@Test
	public void Test_07() {
		String phrase = "";
		assertEquals("00", SimpletestApplication.findLargestWord(phrase));
	}
	
	@Test
	public void Test_08() {
		String phrase = "It";
		assertEquals("00", SimpletestApplication.findLargestWord(phrase));
	}
}
