package m_interface;

public class Puppy implements Animal{
// interface를 implements하므로 무조건 재정의 해줘야함.
   @Override
   public void showHands() {
      System.out.println("멍");
   }

   @Override
   public void sitDown() {
      System.out.println("멍");
      
   }

   @Override
   public void poop() {
      System.out.println("머엉...");
      
   }

   @Override
   public void waitNow() {
      System.out.println("멍");
      
   }

}