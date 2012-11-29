package com.ex.Spring;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class CalcSumTest {
	Calculator calculator;
	String numFilepath;
	
	@Before public void setUp(){
		this.calculator = new Calculator();
		this.numFilepath = getClass().getResource("numbers.txt").getPath();
	}
	@Test public void sumOfNumbers() throws IOException{
		assertThat(calculator.calcSum(this.numFilepath), is(10));
	}
}
