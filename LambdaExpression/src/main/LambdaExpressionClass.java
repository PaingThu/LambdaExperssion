package main;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Class.LambdaSyntax;
import Class.MethodReference;

/**
 * @author Maw Paing Thu
 * @version 1.0.0
 * @see https://github.com/PaingThu/LambdaExperssion To learn the features of
 *      Lambda Expression.
 */
public class LambdaExpressionClass {

	public static void main(String[] args) {
		try {
			System.out.println("Welcome to Learning Lambda Expression ");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("You can learn and see the output of the following fields.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("1. Lamda Syntax.");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("2. Method As Lamda");
			TimeUnit.SECONDS.sleep(2);
			System.out.println("Enter the number of field that you want to learn and see output.");
			Scanner sc = new Scanner(System.in);
			int  field = sc.nextInt();
			switch (field) {
			case 1:
				LambdaSyntax.lambdaSyntax();
				break;
			case 2:
				MethodReference.methodReference();
				break;
			default:
				break;
			}
			

			

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
