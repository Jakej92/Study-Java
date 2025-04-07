package m_interface;

public class Tiger extends AnimalAdapter{
//	poop은 Adapter에서 재정의 하지 않았기때문에 poop은 이 클래스에서 무조건 재정의 해줘야함
//	그렇지 않으면 Tiger아래 빨간줄
   @Override
   public void poop() {
      System.out.println("어흥!");
   }
}