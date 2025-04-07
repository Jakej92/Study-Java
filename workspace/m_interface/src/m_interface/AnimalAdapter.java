package m_interface;

// interface를 사용하고 싶지만, 일부만 사용하고 싶을땐 Adapter를 이용한다.
// Adapter도 항상 abstact로 만들고, 일반 클래스에서 내가 사용하고싶은걸 제외하고
// Adapter에서 재정의를 해준다. 그러면 일반 클래스에서 Adapter를 상속 받을때,
// 쓰고싶은것만 재정의해서 쓸수 있다.
public abstract class AnimalAdapter implements Animal{
   @Override
   public void waitNow() {;} // ;은 건들지 말라는 의미로 사용, 일부러 비워놨다라는 의미
   
   @Override
   public void showHands() {;}
   
   @Override
   public void sitDown() {;}
   
}
