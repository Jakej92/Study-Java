package n_anonymous;

public interface Form {
//	interface에서 선언한 메서드		사용을 위해서는
   public String[] getMenu(); // 반드시 구현해야한다.
   public void sell(String order); // 반드시 구현해야한다.
}