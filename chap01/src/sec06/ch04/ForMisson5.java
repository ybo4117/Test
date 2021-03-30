package sec06.ch04;

public class ForMisson5 {
	public static void main(String[] args) {
		// 2~9단 출력!

		for (int i = 2; i < 10; i++) {
			System.out.printf("%d단\n", i);
			for (int z = 1; z < 10; z++) {
				System.out.printf("%d * %d = %d\n", i, z, i * z);
			}
		}
	}
}