package testCase;

import org.testng.asserts.SoftAssert;

public class SwapStrings {

	public static void main(String[] args) {
		 
		String value1 = "Hello";
		String value2 = "World";
		
		value1 = value1 + value2;
		value2 = value1.substring(0, value1.length()-value2.length());
		value1 = value1.substring(value2.length());
		
		System.out.print(value1 + " "+ value2);
		
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertAll();
	}

}
