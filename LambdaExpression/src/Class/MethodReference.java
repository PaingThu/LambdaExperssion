package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

import FunctionalInterface.ProblemSolver;

public class MethodReference {

	/**
	 * Lambda Expression & Method Reference Example 
	 * 1. Reference to a Static Method 
	 * 2. Reference to an Instance Method of a Particular Object 
	 * 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type 
	 * 4. Reference to a Constructor
	 */
	public static void methodReference() {
		System.out.println("Method Reference Example");

		// 1. Reference to a Static Method
		methodReferenceEx1();

		// 2. Reference to an Instance Method of a Particular Object
		methodReferenceEx2();

		// 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
		methodReferenceEx3();

		// 4. Reference to a Constructor
		methodReferenceEx4();

	}

	/**
	 * 1. Reference to a Static Method
	 */
	private static void methodReferenceEx1() {
		// Lambda Expression
		ProblemSolver lambdaPS = (n) -> EvenOddCheck.isEven(n);
		System.out.println(lambdaPS.test(12));

		// 1. Reference to a Static Method.
		ProblemSolver methodRefPS = EvenOddCheck::isEven;
		System.out.println(methodRefPS.test(11));
	}

	/**
	 * 2. Reference to an Instance Method of a Particular Object
	 */
	private static void methodReferenceEx2() {
		MathOperators mathOpera = new MathOperators();

		// Lambda Expression
		BiFunction<Integer, Integer, Integer> lambdaMultiply = (a, b) -> mathOpera.multiply(a, b);
		System.out.println(lambdaMultiply.apply(1, 2));

		// 2. Reference to an Instance Method of a Particular Object
		BiFunction<Integer, Integer, Integer> methodRefMultiply = mathOpera::multiply;
		System.out.println(methodRefMultiply.apply(3, 4));

	}

	/**
	 * 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
	 */
	private static void methodReferenceEx3() {
		List<String> weeks = new ArrayList<String>();
		weeks.add("Monday");
		weeks.add("Tuesday");
		weeks.add("Wednesday");
		weeks.add("Thursday");
		weeks.add("Firday");
		weeks.add("Saturday");
		weeks.add("Sunday");

		// Lambda Expression
		weeks.stream().map(day -> day.toUpperCase()).forEach(day -> System.out.println(day));

		// 3. Reference to an Instance Method of an Arbitrary Object of a Particular Type
		weeks.stream().map(String::toUpperCase).forEach(System.out::println);
	}

	/**
	 * 4. Reference to a Constructor
	 */
	private static void methodReferenceEx4() {
		// Lambda Expression
		BiConsumer<Integer, Integer> lambdaAdd = (a, b) -> new MathOperators(a, b);
		lambdaAdd.accept(1, 2);

		// 4. Reference to a Constructor
		BiConsumer<Integer, Integer> methodRefAdd = MathOperators::new;
		methodRefAdd.accept(3, 4);

	}

}
