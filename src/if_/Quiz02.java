package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.print("세 수를 입력하시오 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if ((a > b) && (a > c)) {
			System.out.println(a);
		}else if ((b > a) && (b > c)) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}