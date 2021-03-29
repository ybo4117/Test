package sec06.ch04;

public class ForMisson {
	public static void main(String[] args) {
		int i;
		
		for(i = 24 ; i <= 60 ; i++) {
			System.out.println("i : " + i);
			if(i==32) {
				break;
			}
		}
		System.out.println("-------------------");
		
		int count = 24;
		for(i = 52 ; i <= 60 ; i++) {
			System.out.println("count : " + count);
			count = count+1;
		}
		System.out.println("-------------------");
		
		for(i = 52 ; i <= 60 ; i++) {
			System.out.println("i : " + (i-28));
		}
		
	}
}