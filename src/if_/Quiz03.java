package if_;

public class Quiz03 {
	public static void main(String[] args) {
		int n1 = 1, n2 = 2, n3 = 3;

		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("가장 큰수 : " + n1);
			if (n2 > n3) {
				System.out.println("두번째 큰수 : " + n2);
				System.out.println("세번째 큰수 : " + n3);
			}else {
				System.out.println("두번째 큰수 : " + n3);
				System.out.println("세번째 큰수 : " + n2);
			}
		}
		
		else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("가장 큰수 : " + n2);
			if (n1 > n3) {
				System.out.println("두번째 큰수 : " + n1);
				System.out.println("세번째 큰수 : " + n3);
			}else {
				System.out.println("두번째 큰수 : " + n3);
				System.out.println("세번째 큰수 : " + n1);
			}
		}
		
		else {
			System.out.println("가장 큰수 : " + n3);
			if (n2 > n1) {
				System.out.println("두번째 큰수 : " + n2);
				System.out.println("세번째 큰수 : " + n1);
			}else {
				System.out.println("두번째 큰수 : " + n1);
				System.out.println("세번째 큰수 : " + n2);
			}
		}
	}
}

