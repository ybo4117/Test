package sec06.ch04;

public class SwitchMisson3 {
	public static void main(String[] args) {
		int season = (int) (Math.random() * 12) + 1;
		System.out.println("season : " + season + "월");
		// Math.random() 메소드를 이용하여 1~12범위 값만 나오게처리

		// (switch로 해결) season값이
		// 3~5이면 봄
		// 6~8이면 여름
		// 9~11이면 가을
		// 12,1,2 값이면 "겨울"이 콘솔에 찍히도록
		switch (season) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}
}