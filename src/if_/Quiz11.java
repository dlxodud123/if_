package if_;

import java.util.Scanner;

public class Quiz11 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		num = sc.nextInt();
		
		if (num > 0) {
			System.out.println(num + "은 양수입니다");
		}else if (num < 0) {
			System.out.println(num + "은 음수입니다");
		}else {
			System.out.println("0입니다");
		}
	}
}
