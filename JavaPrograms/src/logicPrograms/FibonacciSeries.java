package logicPrograms;

// fibonacci series is a series of  additionn of first two no is third like first two no are 0 , 1 and then 1,2,3,5
public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		int num3 ;
		System.out.println(num1);
		System.out.println(num2);
		for (int i = 2; i<10 ;i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}
	}
}
