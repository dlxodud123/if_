package if_;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.print("두 수를 입력하시오 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a > b) {
			System.out.println(a);
		}if (a < b) {
			System.out.println(b);
		}
	}
}
