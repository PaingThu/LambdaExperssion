package Class;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class LambdaSyntax {

	/**
	 * Lambda Syntax 
	 * lambda operator -> body
	 * (int arg1, String arg2) -> {System.outprintln("Two arguments " + arg1 + " and " + arg2);}
	 */
	public static void lambdaSyntax() {
		
		
		
		System.out.println("Lamda Syntax");
		
		System.out.println("***** Zero Parameter *****");
		zeroParameter();
		
		
		System.out.println("***** One Parameter *****");
		oneParameter();
		

		System.out.println("***** Multi Parameter *****");
		multiParameter();
		
	}

	/**
	 * Zero Parameter Lambda Expression
	 */
	private static void zeroParameter() {
		//Runnable Anonymous Class
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				
				System.out.println("r1 is Runnable Anonymous Class.");
				
			}
		};
		r1.run();
		
		//Runnable Lambda instead of Anonymous Class
		Runnable r2 = () -> System.out.println("r2 is Runnable Lambda.");
		r2.run();
		
	}	
	
	/**
	 * One Parameter Lambda Expression 
	 */
	private static void oneParameter() {
		//Consumer Anonymous Class
		Consumer<String> c1 = new Consumer<String>() {

			@Override
			public void accept(String msg) {
				
				System.out.println("c1 is Consumer Anonymous Class with + ' " + msg + " ' .");
				
			}
		};
		c1.accept("Hello");
		
		//Consumer Lambda instead of Anonymous Class (with data type)
		Consumer<String> c2 = (String msg) -> System.out.println("c2 is Consumer Lambda with ' " + msg + " ' .");
		c2.accept("Hello");
		
		//Consumer Lambda instead of Anonymous Class (without data type)
		Consumer<String> c3 = (msg) -> System.out.println("c3 is Consumer Lambda with ' " + msg + " ' . (withoud data type)");
		c3.accept("Hello");
	}
	
	
	/**
	 * MultiParameter Lambda Expression
	 */
	private static void multiParameter() {
		
		//BiFunction Anonymous Class
		BiFunction<String, String, String> concat1 = new BiFunction<String, String , String>() {

			@Override
			public String apply(String firstString, String secondString) {
				return firstString + secondString;
			}
			
		};
		System.out.println(concat1.apply("Today is ", "a great day."));
		
		//BiFunction Lambda instead of Anonymous Class (with data type)
		BiFunction<Integer, Integer, Integer> sum1 = (Integer num1, Integer num2) -> num1 + num2;
		System.out.println("Result is " + sum1.apply(1, 2));
		
		//BiFunction Lambda instead of Anonymous Class (without data type)
		BiFunction<Integer, Integer, String> sum2 = (num1, num2) -> String.valueOf(num1 + num2);
		System.out.println("Result is " + sum2.apply(3 , 4));
		
	}
	
}
