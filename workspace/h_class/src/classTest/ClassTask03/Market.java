package classTest.ClassTask03;

public class Market {
//	Product 클래스를 배열로 받아와 현재 클래스에 하나의 필드로 사용하기위해 arProduct라는 이름으로 초기화
   Product[] arProduct;
   
   public Market() {;} // 기본 생성자

// 이 클래스에서 Product 클래스를 배열로 받아온 Product[]를 사용하기 위해 매개변수로 받음
   public Market(Product[] arProduct) {
 //   전달받은 매개변수 arProduct를 이 클래스의 arProduct 필드에 초기화
	   this.arProduct = arProduct;
}
//   원하는 값을 찾기위해 sell 메소드 선언, 매개변수에는 값을 찾기 위해 내가 필요로 하는것을 넣어줌
   void sell(Customer customer, int choice) {
//	   customer 클래스에 money 필드 값은 
//	   	arProduct 배열 index를 choice로 선택, price필드를 불러온 후 할인율을 위해
//	     price * (1 - customer.discount / 100.0) 해줌. 그리고 money에서 빼줌
// 	      실제 사용은 메인 클래스에서 해줌
      customer.money -= arProduct[choice].price * (1 - customer.discount / 100.0);
//      choice로 선택한 상품의 stock을 1빼줌
      arProduct[choice].stock--;
   }
   
   
//   쉬움
//   String productName;
//   int productPrice;
//   int productStock;
//   
//   public Market() {;}
//
//   public Market(String productName, int productPrice, int productStock) {
//      this.productName = productName;
//      this.productPrice = productPrice;
//      this.productStock = productStock;
//   }
//
//   void sell(Customer customer) {
//      customer.money -= productPrice * (1 - customer.discount / 100.0);
//      productStock--;
//   }
   
}
