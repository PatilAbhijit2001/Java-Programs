package logicPrograms;

import java.util.Scanner;

// palindrome no is a number which is 121 still same after reverse it 121
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number :- ");
		int num = sc.nextInt();
		sc.close();
		int temp, originalNum, sum = 0;
		originalNum = num;
		while (num > 0) {
			temp = num % 10;
			sum = sum * 10 + temp;
			num = num / 10;
		}
		if (originalNum == sum) {
			System.out.println("It is a Palindrome Number ");
		} else {
			System.out.println("It is Not a Palindrome Number ");
		}
	}
}
