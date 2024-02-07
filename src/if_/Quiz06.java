package if_;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		int kor, eng, mat;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수를 입력하세요 > ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		avg = (kor + eng + mat) / 3.0;
		
		if ((avg <= 100) && (avg >= 90)) {
			System.out.printf("평균 점수는 %.1f이며, 등급은 A입니다.", avg);
		}else if ((avg < 90) && (avg >= 80)) {
			System.out.printf("평균 점수는 %.1f이며, 등급은 B입니다.", avg);
		}else if ((avg < 80) && (avg >= 70)) {
			System.out.printf("평균 점수는 %.1f이며, 등급은 C입니다.", avg);
		}else if ((avg < 70) && (avg >= 60)) {
			System.out.printf("평균 점수는 %.1f이며, 등급은 D입니다.", avg);
		}else if ((avg < 60) && (avg >= 0)) {
			System.out.printf("평균 점수는 %.1f이며, 등급은 F입니다.", avg);
		}else {
			System.out.println("잘못입력하셨습니다");
		}
	}
}
