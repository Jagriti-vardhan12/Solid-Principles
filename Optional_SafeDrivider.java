package java8_com.jv;

import java.util.Optional;

public class Optional_SafeDrivider {
	
	public static Optional<Double> safeDivided(double dividend, double divisor) {
		if (divisor == 0) {
			return Optional.empty();
		}
		return Optional.of(dividend / divisor);
	}

	public static void main(String[] args) {
		double num1 = 10;
		double num2 = 0;
		
		Optional<Double> result = safeDivided(num1, num2);
		
		if (result.isPresent()) {
			System.out.println("Result: " +  result.get());
		} else {
			System.out.println("Not Allowed");
		}
	}
}
