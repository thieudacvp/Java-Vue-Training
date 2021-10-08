package programming;

import java.util.List;

//Print Only Odd Numbers from the List
public class FP01Exercises { 
	
	public static void main(String[] args) {
		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		printCubesOfOddNumbersInListFunctional(numbers);
		printOddNumbersInListFunctional(numbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		
		courses.stream()
			.map(course -> course + " " + course.length()) 
			.forEach(System.out::println);
	}

	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() 
				.filter(number -> number % 2 != 0) 
				.forEach(System.out::println);
	}

	private static void printCubesOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream() 
				.filter(number -> number % 2 != 0) 
				.map (number -> number * number * number)
				.forEach(System.out::println);
	}

}
