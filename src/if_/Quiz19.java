package if_;

import java.util.Scanner;

public class Quiz19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money, num, ex;
		while (true) {
			System.out.print("환전 단위 선택 : (1.달러, 2.원화)");
			money = sc.nextInt();
			if (money == 1) {
				System.out.print("얼마를 환전 하시겠습니까 ? ");
				num = sc.nextInt();
				ex = num * 1326;
				System.out.println(num+"달러를 환전하시면 "+ex+"원 입니다.");
				break;
			}else if (money == 2) {
				System.out.print("얼마를 환전 하시겠습니까 ? ");
				num = sc.nextInt();
				ex = num / 1326;
				System.out.println(num+"원을 환전하시면 "+ex+"달러 입니다.");
				break;
			}
			else {
				System.out.println("다시 입력해주세요");
			}
		}
	}
}
