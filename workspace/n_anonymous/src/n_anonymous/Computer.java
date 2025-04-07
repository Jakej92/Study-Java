package n_anonymous;

public class Computer {
   public static void main(String[] args) {
//      up casting // rpg는 게임의 구현체, rpg의 타입은 rpg뿐만 아니라 부모인 game타입이기도함.
      Game rpg = new Game() { // 구현되지 않은 필드를 구현하기위해 일회성으로 만든 클래스
    	  		//  그래서 이름이 필요없으므로 익명 클래스로 rpg에 담아줌
         @Override
         public void play() {
        	 System.out.println("게임 스타트");
         }

         @Override
         public void exit() {
        	 System.out.println("게임 종료");
         }
         
      };
      System.out.println(rpg instanceof Game); // rpg는 Game타입이니?
      
      rpg.play(); // 게임 rpg에 게임을 구현한 클래스가 들어갔기때문에 rpg. 으로 바로 사용가능
   }
}
