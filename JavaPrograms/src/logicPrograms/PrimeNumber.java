package logicPrograms;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
		for (int i = 0; i < 11; i++) {
			checkPrime(i);
		}
	}

	static void checkPrime(int num) {
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
//				System.out.println("It is Prime Number");
				System.out.println(num);
			} else {
//				System.out.println("Not Prime Number ");
			}
		} else {
//			System.out.println("Not Prime Number ");
		}
	}
}
