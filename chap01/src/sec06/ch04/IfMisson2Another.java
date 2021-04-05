package sec06.ch04;

public class IfMisson2Another {
	//여자 평균키 : 163
	//남자 평균키 : 175
	
	public static void main(String[] args) {
		
		String gender = "남"; // 여;		
		int height= 176;
		
		final String MAN_GENDER = "남자";
		final String WOMAN_GENDER = "여자";
		final int MAN_STAND = 175; // final이 들어가면 변수의 리터럴값을 절때 바꿀 수 없다.
		final int WOMAN_STAND = 163;
		
		//int stand; << 안되는 이유는 변수를 활용하려면  선언이후 초기값을 넣어줘야한다
		String gender_stand = "";
		String result_stand = "평균";
		int stand = 0;
		
		if(gender.equals("남")) {
			stand = MAN_STAND;
			gender_stand = MAN_GENDER;
		} else if(gender.equals("여")) {
			stand = WOMAN_STAND;		
			gender_stand = WOMAN_GENDER;
		} else {
			System.out.println("측정할수없습니다");
		}
		
		if(height < stand) {			
			result_stand = "평균 미만";
		} else if(height > stand){			
			result_stand = "평균 초과";
		}
		
		System.out.printf("%s %s\n", gender_stand, result_stand);
		
	}
}