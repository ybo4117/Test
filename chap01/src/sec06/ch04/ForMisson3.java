package sec06.ch04;

public class ForMisson3 {
	public static void main(String[] args) {
		int star = (int)(Math.random()*6)+5; // star = 5~10 사이의 숫자
		System.out.println("star : " + star);
		for(int i = 0 ; i < star ; i++ ) {
			
			System.out.print("*");
		}
	}
}