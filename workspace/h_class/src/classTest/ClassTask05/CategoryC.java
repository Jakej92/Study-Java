package classTest.ClassTask05;

public class CategoryC {
//	이름을 넣을 필드
   String name;
//   가격을 넣을 필드
   int price;
//   기본 생성자
   public CategoryC() {;}
//   매개변수를 넣은 생성자
   public CategoryC(String name, int price) {
      this.name = name; // name필드에 name을 넣어줌
      this.price = price; // price필드에 price를 넣어줌
   }
}