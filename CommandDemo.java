package com.practice;

/*Command line argument*/
public class CommandDemo {

	public static void main(String[] args) {
		Double a,b;
		String c,op;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=args[2];
		
		if(c.equals("a"))
		{
			System.out.println("\tAddition of "+a+" and "+b+" ="+(a+b));
		}
		
		else if(c.equals("s"))
		{
			System.out.println("\tSubstraction of "+a+" and "+b+" ="+(a-b));

		}

		else if(c.equals("m"))
		{
			System.out.println("\tMultiplication of "+a+" and "+b+" ="+(a*b));

		}

		else if(c.equals("d"))
		{
			System.out.println("\tDivision of "+a+" and "+b+" ="+(a/b));

		}
		
		else
		{
		System.out.println("Invalid input");	
		}
		

	}

}
