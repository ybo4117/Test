package sec06.ch04;

public class WhileMisson {
	public static void main(String[] args) {
		// 1~ 100 합계를 구하시오
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum = sum + i;
			i++;
		}
		System.out.println("합계 : " + sum);
	}
}
