package logicPrograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number :- ");
		int num = scanner.nextInt();
		scanner.close();
		factorial(num);
	}

	private static void factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}
