package FunctionalInterface;

/**
 * 
 * <pre> 
 * Functional Interface
 * A functional interface is an interface that contains only one abstract method.
 * They can have only one functionality to exhibit. 
 * Lambda expression can be used to represent the instance of a functional interface.
 * @FunctionalInterface Annotation is used to ensure that the functional interface can't have more than one abstract method. 
 * It is not mandatory to use annotation.
 * Java 8 contain built in interface like Predicate, BinaryOperator, Function
 * </pre>
 *
 */
public interface Calculator {
	int calculate(int a, int b);
}
