package sec06.ch04;

public class ForMisson5_1 {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			for (int z = 2; z < 10; z++) {
				System.out.printf("%d * %d = %d\t", z, i, z * i);
			}			
			System.out.println();
		}
	}
}