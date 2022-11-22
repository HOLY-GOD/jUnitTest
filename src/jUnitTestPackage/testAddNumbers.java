package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(37, 82);
		assertEquals (119, result);
	}

}

//Ishit Garg
//E21CSEU0067
//EB06