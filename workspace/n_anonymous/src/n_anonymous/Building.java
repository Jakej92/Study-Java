package n_anonymous;

public class Building {
   public static void main(String[] args) {
      Nike gangnam = new Nike(); // 강남에 나이키를 구현해줌
      Nike jamsil = new Nike(); // 잠실에 나이키를 구현해줌
       
      jamsil.register(new FormAdapter() { // 원하는것만 재정의 하기위해 Adapter를 받아옴
         
         @Override
         public String[] getMenu() { // Adapter에서 구현하지 않은 getMenu는 여기서 해줘야함.
            return new String[] { "운동화", "셔츠", "축구공" }; // 문자배열을 리턴해줌
         }
      });
      
      gangnam.register(new Form() { // Form을 재정의 해줌

         @Override
         public void sell(String order) { // form의 sell을 재정의함
            String[] menu = getMenu(); // 문자열 배열 타입 menu에 getMenu를 담아줌
            for (int i = 0; i < menu.length; i++) { // 메뉴의 length만큼 0부터 증가해서 반복
               if (menu[i].equals(order)) { // 반복하며 sell의 order와 같은지 반복해줌
                  System.out.println(menu[i] + " 판매 완료"); // 같다면 판매완료
               }
            }

         }

         @Override
         public String[] getMenu() { // 메뉴를 보여줌
            return new String[] { "운동화", "셔츠", "축구공" };
         }
      });
   }
}