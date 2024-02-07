package if_;

import java.util.Scanner;

public class Quiz09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("년도를 입력하시오 : ");
		year = sc.nextInt();
		
		if ((year >= 1) && (year <= 4000)) {
			if (year % 400 == 0) {
				System.out.println(1);
			}
			else if ((year % 4 == 0) && !(year % 100 == 0)) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}else {
			System.out.println("1~4000사이만 입력");
		}
	}
}
