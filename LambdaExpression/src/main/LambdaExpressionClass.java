package main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Class.FunctionalInterfaceExample;
import Class.LambdaSyntaxExample;
import Class.MethodReferenceExample;

/**
 * @author Maw Paing Thu
 * @version 1.0.0
 * @see https://github.com/PaingThu/LambdaExperssion To learn the features of
 *      Lambda Expression.
 * 
 * Lambda expressions basically express instances of functional interfaces. 
 * Lambda expressions implement the only abstract function and therefore implement functional interface.
 * (int arg1, String arg2)     ->    {System.out.println("Two arguments " + arg1 + " and " + arg2);}
 * |_____________________||_________||______________________________________________________________|
 *     Argument List      Arrow Token                   Body of Lambda Expression
 * 【important point】
 *  	The body of a lambda expression can contain zero, one or more statements.
 */
public class LambdaExpressionClass {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Learning Lambda Expression ");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("You can learn and see the output of the following fields.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("1. Lambda Syntax.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("2. Method Reference");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("3. Functional Interface");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Enter the number of field that you want to see output.");
			Scanner sc = new Scanner(System.in);
			int  field = sc.nextInt();
			switch (field) {
			case 1:
				LambdaSyntaxExample.lambdaSyntax();
				break;
			case 2:
				MethodReferenceExample.methodReference();
				break;
			case 3:
				FunctionalInterfaceExample.functionalInterface();
			default:
				break;
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
