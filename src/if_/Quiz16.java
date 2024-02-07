package if_;

import java.util.Scanner;

public class Quiz16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age, age2;
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		age2 = 20 - age;
		
		if ((age < 20) && (age > 0)) {
			System.out.println(age2 + "살 뒤에 어름이 됩니다.");
		}else if ((age >= 20) && (age < 100)) {
			System.out.println("성인입니다");
		}else {
			System.out.println("1 ~ 99살 까지 입력해주세요");
		}
	}
}
