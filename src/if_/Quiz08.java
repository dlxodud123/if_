package if_;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade, score;
		System.out.println("점수와 학년은 입력 : ");
		score = sc.nextInt();
		grade = sc.nextInt();
		
		if (grade == 4) {
			if (score >= 70) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}else {
			if (score >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격");
			}
		}
	}
}
