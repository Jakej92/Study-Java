package castingTest;

class Car {
	// 필드 생성
	String brand; 
	String color;
	int price;

	public Car() { // 기본 생성자
		;
	}

	// 필드를 매개변수로 사용한 생성자
	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	void engineStart() { // engineStart 메소드 선언
		System.out.println("시동 켜기"); // 출력
	}

	void engineStop() { // engineStop 메소드 선언
		System.out.println("시동 끄기"); // 출력
	}
}

class SuperCar extends Car { // Car class를 상속받는 SuperCar class
	String mode; // 필드 생성 (+@)

	@Override
//	상속 받은 클래스의 메소드를 사용하지만 원하는걸 출력하기위해 Overriding 해줌
	void engineStart() { 
		System.out.println("음성으로 시동 켜기"); // 수정된 출력 메세지
	}

	void openRoof() { // +@ 메소드 선언
		System.out.println("뚜따"); // 추가된 출력 메세지
	}

}

public class CastingTest01 {
	public static void main(String[] args) {
//      up casting
		Car noOptionFerrari = new SuperCar();

//      down casting
		SuperCar fullOptionFerrari = (SuperCar) noOptionFerrari;

		Car matiz = new Car();

//      오류 // up casting이 된적 없으므로 down casting 불가능.
//      SuperCar brokenFerrai = (SuperCar)new Car();

		System.out.println(noOptionFerrari instanceof Car); // 
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		System.out.println(matiz instanceof SuperCar);

	}
}
