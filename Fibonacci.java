package Fibonacci;

import java.util.Scanner;

/**
 * ��ǰûд��for-loop��Fibonacci���У��о�ͦ��Ȥ��ͻȻ��дһ��
 * Author��Arthur Leo 2018-09-12
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//IO Stream as input argument
		int num = scanner.nextInt();//abtain int value
		Fib(num);
	}
	/**
	 * output the all number of n's fibonacci
	 * */
	public static void Fib(int n) {
		long sum = 0;
		long a = 1, b = 1;
		if (n <= 2) {
			if (1 == n)
				System.out.println(1);
			if (2 == n)
				System.out.println(1 + " " + 1);
			return;
		}
		System.out.print(1 + " " + 1 + " ");
		/**
		 * define sum parameter as  the last two arguments' sum of each operation,
		 * then copy a to b as b of the next operation,and copy the sum to a as a of the next operation
		 * */
		for (int i = 3; i <= n; ++i) {
			sum = a + b;
			b = a;
			a = sum;
			System.out.print(a + " ");
		}
	}
}
