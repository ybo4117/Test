package sec06.ch04;

public class ForMisson4 {
	public static void main(String[] args) {
		int dan = (int)(Math.random()*8)+2;
		//2~9사이 랜덤값
		System.out.println(dan+"단");
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			System.out.println(dan + " * " + i +" = " + dan * i);
		}
		System.out.println("-----------------------");
		for(int i = 6 ; i < 15 ; i++) {
			System.out.printf("%d * %d = %d\n", dan, i-5, dan*(i-5));
		}
	}
}