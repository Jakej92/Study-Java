package classTest.ClassTask01;

// 자동차 클래스 선언
// 브랜드, 색상, 가격

// 시동 켜기, 시동 끄기
// 각 메소드는 브랜드명을 활용하여, 아래와 같이 출력한다.
// "브랜드 시동 켜짐", "브랜드 시동 꺼짐"
// 초기화된 브랜드명을 "브랜드"자리에 넣어서 출력한다.
class Car {
//	static long seq; // 연산이 되어야 하기때문에 초긱밧이 0 인 long으로.
	static Long seq; // 초기값이 null, 연산을 위해서는 아래에서 static 필드를 추가해줘야함.
	Long id; // id는 class 자료형인 Long으로 선언하자.
	String brand;
	String color;
	int price;
	
	
//	static 필드
//	생성자가 최초 호출되었을 때 딱 한 번만 실행되는 영역
	static {
		seq = 0L;
	}
	
//	초기화 필드
//	어떤 생성자가 호출되던지 먼저 실행되는 영역
	{
		id = ++seq;
	}
   
//   기본 생성자
//   반드시 기본 생성자를 선언한다.
   public Car() {;} // 기본 생성자 내용은 비어 있음
   

//    매개변수가 있는 생성자
//    객체 생성 시 브랜드, 색상, 가격 값을 초기화할 수 있다.
//    Alt + Shift + S, O를 눌러 생성자 자동 생성 가능
//    자동 생성할 필드 선택 후 엔터!
   public Car(String brand, String color, int price) {
      this.brand = brand; // 전달받은 브랜드 값을 필드에 저장
      this.color = color; // 전달받은 색상 값을 필드에 저장
      this.price = price; // 전달받은 가격 값을 필드에 저장
   }

//    엔진 시동 켜기 메소드
//    "브랜드명 시동 켜짐" 메시지를 출력합니다.
   void engineStart() {
      System.out.println(brand + " 시동 켜짐");
   }

//    엔진 시동 끄기 메소드
//    "브랜드명 시동 꺼짐" 메시지를 출력합니다.
   void engineStop() {
      System.out.println(brand + " 시동 꺼짐");
   }
}

// 메인 클래스 선언, 사용을 위해 메인 메소드를 불러준다.
public class ClassTask01 {
   public static void main(String[] args) {
//       객체 생성 및 초기화
//       엄마의 자동차를 나타내는 객체 생성
//       브랜드: Benz, 색상: Black, 가격: 35000 (단위: 만원)
      Car momCar = new Car("Benz", "Black", 35000);

//       아빠의 자동차를 나타내는 객체 생성
//       브랜드: BMW, 색상: Blue, 가격: 15000 (단위: 만원)
      Car dadyCar = new Car("BMW", "Blue", 15000);

//       기본 생성자를 사용하여 자동차 객체 생성
//       brand, color, price는 초기화되지 않음, 기본 생성자는 비어 있어도 됨.
      Car myCar = new Car();

//       엄마의 자동차 시동 켜기 및 끄기 동작 확인
      momCar.engineStart(); // "Benz 시동 켜짐" 출력
      momCar.engineStop();  // "Benz 시동 꺼짐" 출력

//       아빠의 자동차 시동 켜기 및 끄기 동작 확인
      dadyCar.engineStart(); // "BMW 시동 켜짐" 출력
      dadyCar.engineStop();  // "BMW 시동 꺼짐" 출력
   }
}
