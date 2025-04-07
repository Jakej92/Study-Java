package abstractTest;

public class Refrigerator extends Electronics {

   @Override
   public void on() { // abstract로 구현을 안해놨기 때문에 사용하기 위해서는 반드시 구현해줘야함.
      System.out.println("버튼을 위로 올려서 전원 켜기");

   }

   @Override
   public void off() { // abstract로 구현을 안해놨기 때문에 사용하기 위해서는 반드시 구현해줘야함.
      System.out.println("버튼을 아래로 내려서 전원 끄기");

   }
}