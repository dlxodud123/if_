package if_;

import java.util.Scanner;

public class Quiz18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, sum, etc, etc2, heavy;
		System.out.print("무게를 입력하시오 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a + b + c;
		etc = 600 - sum;
		etc2 = sum - 600;
		
		if ((a>b)&&(a>c)) {
			heavy = a;
		}else if ((b>a) &&(b>c)) {
			heavy = b;
		}else {
			heavy = c;
		}
		
		if (sum <= 600) {
			System.out.println("무게 총합 : " + sum);
			System.out.println("남은 무게 : " + etc);
			System.out.println("가장 무거운 무게 : " + heavy);
		}else {
			System.out.println("무게 초과 ,"+etc2+"를 제외해주세요");
		}
		
	}
}
