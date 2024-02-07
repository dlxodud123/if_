package if_;

import java.util.Scanner;

public class Quiz14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor, eng, mat, grade, avg, out1, out2, out3;
		System.out.print("국어,영어,수학,학년 입력 : ");
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		grade = sc.nextInt();
		avg = (kor + eng + mat) / 3;
		out1 = 65 - avg;
		out2 = 75 - avg;
		out3 = 80 - avg;
		
		if ((grade == 1) || (grade == 2) || (grade == 3)) {
			if (avg >= 65) {
				System.out.println("합격입니다.");
			}else {
				System.out.println(out1+"점 미달로 불합격입니다.");
			}
		}if ((grade == 4) || (grade == 5)) {
			if (avg >= 75) {
				System.out.println("합격입니다.");
			}else {
				System.out.println(out2+"점 미달로 불합격입니다.");
			}
		}if (grade == 6) {
			if (avg >= 80) {
				System.out.println("합격입니다.");
			}else {
				System.out.println(out3+"점 미달로 불합격입니다.");
			}
		}
	}
}
