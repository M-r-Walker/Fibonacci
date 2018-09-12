package Fibonacci;
import java.util.Scanner;
/**
 * 面试过程中，问道这个题目，突然间脑袋抽抽，啥也不知道了，等回到租屋，闭关10分钟，
 * 搞出来后，那叫一个愁回百转，算了，几下这个经历吧。
 * Author：Arthur Leo
 * 2018-09-12
 * */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Fib(num);
	}
	public static void Fib(int n) {
		long  sum = 0;
		long a = 1,b=1;
		if(n <= 2) {
			if(1 == n)
			System.out.println(1);
			if(2 == n)
				System.out.println(1 + " " + 1);
			return;
		}
		System.out.print(1 + " " + 1 + " ");
		for (int i = 3; i <= n;++i) {
			sum = a + b;
			b = a;
			a = sum;
			System.out.print(a + " ");
		}
	}
}
