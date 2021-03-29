package sec06.ch04;

public class SwitchMission {
	public static void main(String[] args) {
		int time = (int) (Math.random() * 4) + 8;
		double test = (double)Math.random();
		System.out.println("현재시간 : " + time);
		System.out.println(test);
		//Math.random() << 이녀석은 0.0000000000000...1 ~ 0.99999999999999999... 가출력됨
		// 8~11 사이 정수값이 time변수에 대입된다.

		// time 8이면 "출근합니다"
		// time 9이면 "회의를 합니다"
		// time 10이면 "업무를 봅니다"

		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다.");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		}
	}
}