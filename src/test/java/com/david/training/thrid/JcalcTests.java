package com.david.training.thrid;

import static org.junit.Assert.*;

import org.junit.Test;

public class JcalcTests {

	@Test
	void addTest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(10, myCalc.addTwoNum(5, 5));		
	}
	
	@Test
	void subTest() {
		JenkinsCalc myCalc = new JenkinsCalc();
		assertEquals(5, myCalc.subTwoNum(10, 5));		
	}

}
