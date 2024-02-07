package if_;

import java.util.Scanner;

public class Quiz13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.print("문자열 입력 : ");
		a = sc.next();
		
		if (a.contains("a")) {
			System.out.println("포합되어있습니다");
		}else {
			System.out.println("포합되어있지 않습니다");
		}
	}
}
