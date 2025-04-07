package classTest.ClassTask05;

public class AdCompany {
//	대카테고리를 배열로 받아옴. 중, 소 카테고리를 포함하고 있음.
   CategoryA[] arCategories;
//   기본 생성자
   public AdCompany() {
      ;
   }
//   배열인 대카테고리를 매개변수로 넣은 생성자 
   public AdCompany(CategoryA[] arCategories) {
      this.arCategories = arCategories; // 매개변수 arCategoies를 필드에 저장
   }
//   true or false값을 찾기위해 boolean 타입으로
//   sell 이라는 메소드를 선언.
//   매개변수로 clien클래스의 client, 대카테고리, 중카테고리, 소카테고리를 받아옴
   boolean sell(Client client, String categoryA, String categoryB, String categoryC) {
//	   정수 타입의 price에 findCategory를 넣어줌 
      int price = findCategory(categoryA, categoryB, categoryC);
      if(price != -1) { // 만약 가격이 -1이 아니면
         client.money -= price; // 클라이언트의 잔고에서 가격을 빼줌
         return true; // 그리고 true로 리턴해줌
      }
      return false; // 아니면 false 로 리턴해줌
   }
//   findCategory 메소드를 선언
//   대카테고리, 중카테고리, 소카테고리를 매개변수로 받아옴
   int findCategory(String categoryA, String categoryB, String categoryC) {
//	   반복문을 이용하여 대카테고리(arCategories)의 length만큼 반복해줌
      for (int i = 0; i < arCategories.length; i++) {
//         대카테고리와 비교하여 같은지 확인해주고 같다면 다음 for문으로 넘어감
         if (arCategories[i].name.equals(categoryA)) {
//        	 대카테고리에 i를 넣어 반복해주고, 중카테고리의 length만큼 반복해줌
            for (int j = 0; j < arCategories[i].arCategoryB.length; j++) {
//               중카테고리와 같은지 확인하고 같다면 다음 for문으로 넘어감
               if (arCategories[i].arCategoryB[j].name.equals(categoryB)) {
//            	   대카테고리 i만큼, 중카테고리j만큼, 소카테고리 length만큼 반복해줌
                  for (int k = 0; k < arCategories[i].arCategoryB[j].arCategoryC.length; k++) {
//                     소카테고리와 같은지 확인하고 같다면 다음으로 넘어감
                     if (arCategories[i].arCategoryB[j].arCategoryC[k].name.equals(categoryC)) {
//                        지금까지 다 같았다면 가격을 리턴해줌
                        return arCategories[i].arCategoryB[j].arCategoryC[k].price;
                     }
                  }
               }
            }
         }
      }
//      다르다면 -1을 리턴해줌
      return -1;
   }
}




