package if_;

import java.util.Scanner;

public class Quiz10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, age, born;
		System.out.println("현재 년도 및 나이 입력");
		year = sc.nextInt();
		age = sc.nextInt();
		born = year -age +1;
		
		System.out.println(born + "년대에 태어났습니다");
	}
}
