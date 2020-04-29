package Class;

public class MathOperators {
	public MathOperators() {
		// TODO Auto-generated constructor stub
	}
	
	public MathOperators(int a, int b) {
		System.out.println("Sum of " + a + "  and " + b + " is " + (a + b));
	}
	
	
	/**
	 * Multiply Operator : Multiplying two input numbers and return the result
	 * @param a 
	 * 		int type input parameter
	 * @param b
	 * 		int type input parameter
	 * @return int type multiply of a and b
	 */
	public int multiply(int a, int b) {
		return a * b;
	}
	
	/**
	 * Subtracting two input numbers and return the result
	 * @param a
	 * 		int type input parameter
	 * @param b
	 * 		int type input parameter
	 * @return int type subtract of a and b
	 */
	public int sub(int a, int b) {
		return a - b;
	}
	
}
