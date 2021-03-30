package sec06.ch04;

public class ForMisson9 {
	public static void main(String[] args) {
		int star = 5;
		System.out.println("star : " + star);

		for (int i = 1; i <= star; i++) {
			for (int z = i; z < star; z++) {
				System.out.print("_");
			}
			for (int z = 0; z < i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("------------------");

		int count;
		for (int i = 1; i <= star; i++) {
			count = i;
			for (int z = 1; z <= star; z++) {
				if (count < star) {
					System.out.print("_");
					count++;
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}