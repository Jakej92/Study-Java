package classTest.ClassTask03;

public class Customer {
//	필드 선언
   String name;  // 손님 이름
   int discount;  // 손님이 가진 할인율
   int money;  // 손님이 가진 잔고
   
   public Customer() {;} // 기본 생성자

//   필요한 필드들을 매개변수로 넣은 생성자
   public Customer(String name, int discount, int money) {
      this.name = name; // name 이란 필드를 name으로 사용하기위해 넣어줌
      this.discount = discount; // discount 이란 필드를 discount로 사용하기위해 넣어줌
      this.money = money; // money 이란 필드를 money로 사용하기위해 넣어줌
   }
}