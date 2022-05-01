package com.greatlearning.app;

import java.util.Stack;

public class balancingBracketSolution {

	
	//function to check if brackets are balanced
	public static boolean checkExpression(String bracketExpression) 
	{
		Stack<Character> stack = new Stack<Character>();
		
		for (int i=0; i< bracketExpression.length() ;i++)
				{
					char character = bracketExpression.charAt(i);
							
							
						if (character =='(' || character =='{' || character == '[')
						{
							stack.push(character);
						}
						
						if (stack.isEmpty())
							return false;
		
					char c;
					switch(character) {
					
					case '}':
						c= stack.pop();
						if (c == '(' || c=='[')
							return false;
							break;
							
					case ')':
						c= stack.pop();
						if (c == '{' || c=='[')
							return false;
							break;
							
					case ']':
						c= stack.pop();
						if (c == '(' || c=='{')
							return false;
							break;
					}
				}
		
		return stack.isEmpty();
	}
	//Driver Code
	public static void main(String[] args) {
		
		
		String bracketExpression = "([[{()}]])";
		
		Boolean result;
		result = checkExpression(bracketExpression);
		
		 if (result) {
			 System.out.println("The entered String has Balanced Brackets");
		 }
		 else
			 System.out.println("The entered String does not have Balanced Brackets");

	}

}
