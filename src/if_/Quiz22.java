package if_;

import java.util.Scanner;

public class Quiz22 {
	public static void main(String[] args) {
		int hour, minute;
		Scanner sc = new Scanner(System.in);
		System.out.println("[]시 []분 입력");
		hour = sc.nextInt();
		minute = sc.nextInt();
		
		if ((hour>=0)&&(hour<=23)&&(minute>=0)&&(minute<=59)) {
			if((minute>=0)&&(minute<=24)) {
				if (hour == 0) {
					System.out.println("전날 23시 "+(60-(25-minute))+"분 알람");
				}else{
					System.out.println((hour-1)+"시 "+(60-(25-minute))+"분 알람");
				}
			}else {
				System.out.println(hour+"시 "+(minute-25)+"분 알람");
			}
		}else {
			System.out.println("범위 이탈");
		}
		
	}
}
