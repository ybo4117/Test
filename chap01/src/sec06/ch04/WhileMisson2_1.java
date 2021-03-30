package sec06.ch04;

public class WhileMisson2_1 {
	public static void main(String[] args) {
		int sum = 0;
		while (true) {
			int val = (int) (Math.random() * 11); // 0~10 사이 랜덤 값이 나오도록
			System.out.println("val : " + val);
			sum = sum + val;
			if (val == 0) {
				break;
			}
		}
		System.out.println("sum : " + sum);
	}
}