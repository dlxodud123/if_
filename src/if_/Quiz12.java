package if_;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("두 수 입력 : ,및 기호 입력 : (+ - * / %)");
				
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if (c == 1) {
			System.out.println(a + b);
		}else if (c == 2) {
			System.out.println(a - b);
		}else if (c == 3) {
			System.out.println(a * b);
		}else if (c == 4) {
			System.out.println(a / b);
		}else if (c == 5) {
			System.out.println(a % b);
		}
		
	}
}
