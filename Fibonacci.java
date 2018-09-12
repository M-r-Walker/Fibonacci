package Fibonacci;
import java.util.Scanner;
/**
 * ���Թ����У��ʵ������Ŀ��ͻȻ���Դ���飬ɶҲ��֪���ˣ��Ȼص����ݣ��չ�10���ӣ�
 * ��������ǽ�һ����ذ�ת�����ˣ�������������ɡ�
 * Author��Arthur Leo
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
