package n_anonymous;

public abstract class FormAdapter implements Form {

   @Override
   public void sell(String order) {;} 
   // sell은 쓰고싶지 않기 때문에 Adapter를 만들어서 필요하지 않은것만 따로 구현해 놓음.

}