package com.himakshi.balancebracket.main;

import com.himakshi.balancebracket.service.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {

		String bracketExpression =  "([[]])";



		Boolean result;

		result = BalancingBrackets.areBracketsBalanced (bracketExpression);

		if (result)
			System.out.println("The entered String has Balanced Brackets"); 
		else
			System.out.println("The entered Strings do not contain Balanced Brackets ");

	}

}