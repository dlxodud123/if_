package if_;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		int n1, n2;
		String h1, h2;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번쨰 이름 입력, 주사위 1~6자리중 입력 : ");
		h1 = sc.next();
		n1 = sc.nextInt();
		
		System.out.print("두번쨰 이름 입력, 주사위 1~6자리중 입력 : ");
		h2 = sc.next();
		n2 = sc.nextInt();

		if ((1 > n1)||(n1 > 6)||(1 > n2)||(n2 > 6)) {
			System.out.println("1~6 사이의 숫자만 입력해주세요");
		}else if(n1 > n2) {
			System.out.println(h1 + " 승리");
		}else if (n1 < n2) {
			System.out.println(h2 + " 승리");
		}else {
			System.out.println("무승부");
		}
	}
}