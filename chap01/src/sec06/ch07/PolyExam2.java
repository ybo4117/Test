package sec06.ch07;

public class PolyExam2 {
	
	public static void main(String[] args) {
		// instanceof 는 상속관계일때 사용하는 기능
		
		Car car1 = new LocalBus();		
		LocalBus lb1 = (LocalBus)car1;		
		System.out.println(car1 instanceof LocalBus);
		
		Bus bus1 = (Bus)car1;
		System.out.println(car1 instanceof Bus);
		
		Car car2 = new Bus();
		//LocalBus lb2 = (LocalBus)car2; << 런타임에러
		System.out.println(car2 instanceof LocalBus);
		
		Car car3 = new Truck();
		System.out.println(car3 instanceof Bus);
		
		
	}

}
