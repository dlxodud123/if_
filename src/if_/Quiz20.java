package if_;

import java.util.Scanner;

public class Quiz20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, prize;
		System.out.print("주사위 3개 입력 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if ((a==b) && (b==c)) {
			prize = 10000 + a * 1000;
			System.out.println("상금 : " + prize);
		}else if ((a==b) || (a==c) || (b==c)) {
			if (a==b) {
				prize = 1000 + a*100;
				System.out.println("상금 : " + prize);
			}else if (a==c) {
				prize = 1000 + a*100;
				System.out.println("상금 : " + prize);
			}else {
				prize = 1000 + b*100;
				System.out.println("상금 : " + prize);
			}
		}else {
			if ((a>b)&&(a>c)) {
				prize = a*100;
				System.out.println("상금 : " + prize);
			}else if ((b>a)&&(b>c)) {
				prize = b*100;
				System.out.println("상금 : " + prize);
			}else {
				prize = c*100;
				System.out.println("상금 : " + prize);
			}
		}
	}
}
