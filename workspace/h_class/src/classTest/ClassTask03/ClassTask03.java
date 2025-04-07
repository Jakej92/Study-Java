package classTest.ClassTask03;

//   화면
//   마트를 오픈해서 상품을 판매하고자 한다.
//   손님이 상품을 구매하면, 할인율에 맞게 가격이 조정된다.
//   손님들은 이름, 할인율, 잔액의 정보를 가지고 있다.

//   쉬움
//   마트는 1개의 상품만 판매한다.
//   상품명, 가격, 재고
//   판매하기

//   어려움
//   마트는 3개의 상품을 판매한다.
//   상품들
//   손님이 선택한 상품 판매하기

public class ClassTask03 {
	   public static void main(String[] args) {
	      Product[] arProduct = {
	         new Product("새우깡", 500, 10),   
	         new Product("감자깡", 900, 5),   
	         new Product("맛동산", 500, 17),   
	      };
//	      Product 클래스를  배열로 불러와서 배열에 요소들을 넣어준다.
//	      arProduct[0] = {"새우깡", 500, 10}
//	      arProduct[1] = {"감자깡", 900, 5}
//	      arProduct[2] = {"맛동산", 500, 17}
	      
//	      입력한 상품의 배열(arProduct)들을 Market클래스에 넣어준다.
	      Market emart = new Market(arProduct);

//	      Customer class를 받아와서 ted라는 이름으로 선언하고 요소들을 채워준다.
	      Customer ted = new Customer("한동석", 50, 5000);

	      
//	      상품 판매를 위해 고객의 정보와 선택한 번호를 고른다.
	      emart.sell(ted, 1);

//	      출력으로 고객의 잔돈과 상품의 재고 확인.
	      System.out.println(ted.money);
	      System.out.println(arProduct[1].stock);

      
//      Market emart = new Market("새우깡", 1500, 10);
//      Customer ted = new Customer("한동석", 50, 5000);
//      
//      emart.sell(ted);
//      
//      System.out.println(ted.money);
   }
}

















