package sec06.ch04;

public class WhileMisson2 {
	public static void main(String[] args) {
		int sum = 0; // 0이 아니면 계속 sum에 더해주세요( 0이 나올때까지 반복문을 돌리기)
		int val = (int) (Math.random() * 11); // 0~10 사이 랜덤 값이 나오도록

		while (val != 0) {
			val = (int) (Math.random() * 11); // 0~10 사이 랜덤 값이 나오도록
			System.out.println("val : " + val);
			sum = sum + val;
		}
		System.out.println("sum : " + sum);
		
	}
}