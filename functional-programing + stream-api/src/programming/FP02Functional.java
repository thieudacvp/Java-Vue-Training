package programming;

import java.util.List;
import java.util.stream.Collectors;

public class FP02Functional {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		List<Integer> squaredNumbers = squareList(numbers);
		
		List<Integer> evenNumbersOnly = numbers.stream()
										.filter(x -> x%2==0)
										.collect(Collectors.toList());
		
		System.out.println(squaredNumbers);
		System.out.println(evenNumbersOnly);
		

	}
	
	private static List<Integer> squareList(List<Integer> numbers) {

		
		return numbers.stream()
				.map(number -> number * number)
				.collect(Collectors.toList());
	}

}
