package Class;

import java.util.function.Function;
import java.util.function.IntFunction;

public class MethodReference {
	
	public static void methodReference() {
		System.out.println("Method Reference Example");
		//Using Lambda Expression
		IntFunction<String> intToString = num -> Integer.toString(num);
		String output = intToString.apply(123);
		System.out.println(output);
		
		
		//Using 
		IntFunction<String> intToString2 = Integer :: toString;
		String output2 = intToString2.apply(123);
		System.out.println("Static method reference using :: -> " + output);
		
		Function<String, Integer> newInteger = Integer :: new;
		int output3 = newInteger.apply("123" + 456);
		System.out.println(output3);
	
		
		
	}
	
	
	
}
