package if_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; 
		System.out.println("수 입력 : ");
		num = sc.nextInt();
		if(num > 10) {
			System.out.println("1.종속문장실행");
			System.out.println("2.종속문장실행");
			System.out.println("3.종속문장실행");
		}
		System.out.println("다음 문장들 실행");
	}
}
