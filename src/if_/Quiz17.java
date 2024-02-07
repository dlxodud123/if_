package if_;

import java.util.Scanner;

public class Quiz17 {
	public static void main(String[] args) {
		int age, money;
		Scanner sc = new Scanner(System.in);
		System.out.println("나이와 금액 입력 : ");
		age = sc.nextInt();
		money = sc.nextInt();
		
		if (((age >= 10)&&(age <=15))&&(money == 13000)) {
			System.out.println("어린이표 구매 가능");
		}else if ((age >= 19) && (money == 15000)) {
			System.out.println("성인표 구매 가능");
		}else {
			System.out.println("구매가능 상품 없음");
		}
	}
}
