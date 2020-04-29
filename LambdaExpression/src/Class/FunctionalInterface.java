package Class;

import FunctionalInterface.Calculator;

public class FunctionalInterface {
	
	public static void functionalInterface() {
		System.out.println("Functional Interface");
		
		Calculator add = (a,b) -> a + b;
		System.out.println(add.calculate(1, 2));
		
		Calculator difference = (a,b) -> Math.abs(a-b);
		System.out.println(difference.calculate(3, 2));
		
		
		MathOperators mathOperator = new MathOperators();
		Calculator multiply = mathOperator :: multiply;
		System.out.println(multiply.calculate(4, 5));
		
		
	}
	
}
