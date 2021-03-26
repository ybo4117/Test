package sec06.ch04;

public class IfMisson2 {
	//여자 평균키 : 163
	//남자 평균키 : 175
	
	public static void main(String[] args) {
		
		String gender = "남"; // 여;		
		int height = 176;
		
		if(gender.equals("남")) {
			if(height < 175) {
				System.out.println("평균미만");
			} else if(height == 175){
				System.out.println("평균");
			} else {
				System.out.println("평균초과");
			}
			
			
		} else if(gender.equals("여")) {
			
			if(height < 163) {
				System.out.println("평균미만");
			} else if(height == 163){
				System.out.println("평균");
			} else {
				System.out.println("평균초과");
			}
			
		} else {
			System.out.println("측정할수없습니다");
		}
		
	}
}