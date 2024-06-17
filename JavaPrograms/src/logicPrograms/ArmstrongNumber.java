package logicPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ");
		int num = sc.nextInt();
		int num1 = num;
		int rem = 0;
		int count = 0;
		int temp = 0;
		int fin = 0;
		while (num > 0) {
//			rem = num % 10 ;
			num = num/ 10;
			count++;
		}
		System.out.println(count);
		for(int i = 1; i <= count;i++) {
			rem = num1 % 10 ;
			for (int j = 1; j <= count;j++) {
			temp = temp  * i;
			//fin = fin +temp;
			}
		}
		System.out.println(fin);
		System.out.println(temp);
	}

}
