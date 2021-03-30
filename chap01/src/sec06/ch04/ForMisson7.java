package sec06.ch04;

public class ForMisson7 {
	public static void main(String[] args) {
		int star = (int) (Math.random() * 5) + 3;
		System.out.println("star = " + star);
		for (int i = 0; i <= star; i++) {
			for (int z = 0; z < i; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------------");
		for (int i = 0; i < star; i++) {
			for (int k = i; k < star; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		for (int i = star; i > 0; i--) {
//			for (int k = star; k < i+star; k++) {				
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}
}