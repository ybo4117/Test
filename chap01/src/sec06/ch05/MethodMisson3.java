package sec06.ch05;

public class MethodMisson3 {
	public static void main(String[] args) {
		sumAllFromTo(5, 10); // sum : 45

		sumAllFromTo(2, 4); // sum : 9

		sumAllFromTo(1, 100); // sum : 5050

		sumAllFromTo(4, 2); // sum : 9
	}

	public static void sumAllFromTo(int n1, int n2) {
		int sum = 0;
		int temp = 0;
		if (n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		
//		if (n1 < n2) {
//			for (int i = n1; i <= n2; i++) {
//				sum += i;
//			}
//		} else {
//			for (int i = n2; i <= n1; i++) {
//				sum += i;
//			}
//		}

		System.out.println("sum : " + sum);
	}
}