package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunctions junitstring = new jUnitFunctions();
		String result = junitstring.addStrings("Bennett ", "University");
		assertEquals ("Bennett University", result);
	}

}

//Ishit Garg
//E21CSEU0067
//EB06