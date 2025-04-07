package n_anonymous;

public class Nike {
   public void register(Form form) { // register 메소드 선언, interface인 form을 받아옴
      String[] menu = form.getMenu(); // interface form안에 메소드는 구현이 안되어있음.
      									// 사용을 위해선 반드시 구현해줘야함.
      
      for (int i = 0; i < menu.length; i++) { // for문 0부터 배열 menu의 length만큼 반복해줌
         System.out.println(menu[i]); // menu를 출력해줌 
      }
      
      if(form instanceof FormAdapter) { // 만약 form이 Adapter와 타입이 같다면
         System.out.println("무료 나눔 매장"); // 무료 나눔 매장으로 출력해줌
         return;
      }
      form.sell("운동화"); // 그렇지않다면 form.sell을 바로 사용해줌
   }

}