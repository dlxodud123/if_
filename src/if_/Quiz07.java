package if_;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		int a,b,c,d,e,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("1,2,3,4,5과목 점수 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		sum = a + b + c + d + e;
		
		if ((a < 60) || (b < 60) ||(c < 60) ||(d < 60) ||(e < 60) ) {
			System.out.println("불합격입니다.");
		}else if (sum >= 400) {
			System.out.println("합격입니다!");
		}
	}
}
