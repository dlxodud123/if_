package if_;

import java.util.Scanner;

public class Quiz15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.print("오늘은 5월 1일, 앞으로 숫잣 입력 : ");
		a = sc.nextInt();
		
		if ((a >= 1) && (a <= 30)) {
			if (a % 7 == 0) {
				System.out.println("수요일");
			}else if (a % 7 == 1) {
				System.out.println("목요일");
			}else if (a % 7 == 2) {
				System.out.println("금요일");
			}else if (a % 7 == 3) {
				System.out.println("토요일");
			}else if (a % 7 == 4) {
				System.out.println("일요일");
			}else if (a % 7 == 5) {
				System.out.println("월요일");
			}else if (a % 7 == 6) {
				System.out.println("화요일");
			}
		}else {
			System.out.println("1 ~ 30숫자를 입력해주세요");
		}
		
	}
}	
