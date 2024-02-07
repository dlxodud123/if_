package if_;

import java.util.Scanner;

public class Quiz21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, menu, exchange, eat;
		System.out.println("-------메뉴판-------");
		System.out.println("1. 햄버거(9000원)");
		System.out.println("2. 피자(11000원)");
		System.out.println("3. 치킨(32000원)");
		System.out.println("4. 금액 반환");
		System.out.println("-------메뉴판-------\n");
		
		System.out.print("금액 및 메뉴 입력 및 (1.포장, 2.매장) : ");
		money = sc.nextInt();
		menu = sc.nextInt();
		eat = sc.nextInt();
		
		if (money < 9000) {
			System.out.println("주문할 수 있는 메뉴 X "+money+"반환");
		}else if (menu == 4) {
			System.out.println("투입 금액 "+money+"원 반환");
		}else if (menu == 1) {
			exchange = money - 9000;
			System.out.println("--------------------");
			System.out.println("주문메뉴 : 1. 햄버거(9000원)");
			if (eat == 1) {
				System.out.println("포장");
			}else{
				System.out.println("매장식사");
			}System.out.println("거스름돈 : "+exchange);
			System.out.println("--------------------");
		}else if (menu == 2) {
			if (money >= 11000) {
				exchange = money - 11000;
				System.out.println("--------------------");
				System.out.println("주문메뉴 : 2. 피자(11000원)");
				if (eat == 1) {
					System.out.println("포장");
				}else if (eat == 2){
					System.out.println("매장식사");
				}else {
					System.out.println("1,2번 선택오류");
				}
				System.out.println("거스름돈 : "+exchange);
				System.out.println("--------------------");
			}else {
				System.out.println("투입 금액 부족. "+money+"반환");
			}
		}else if (menu == 3) {
			if (money >= 32000) {
				exchange = money - 32000;
				System.out.println("--------------------");
				System.out.println("주문메뉴 : 3. 치킨(32000원)");
				if (eat == 1) {
					System.out.println("포장");
				}else if (eat == 2){
					System.out.println("매장식사");
				}else {
					System.out.println("1,2번 선택오류");
				}
				System.out.println("거스름돈 : "+exchange);
				System.out.println("--------------------");
			}else {
				System.out.println("투입 금액 부족. "+money+"반환");
			}
		}else {
			System.out.println("올바른 주문이 아닙니다.");
		}
	}
}

