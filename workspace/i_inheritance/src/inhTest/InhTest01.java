package inhTest;

class A {
   String name;
   
   public A() {
      System.out.println("부모 생성자 호출");
   }
}

class B extends A{
   public B() {
      super();
      System.out.println("자식 생성자 호출");
   }
}

public class InhTest01 {
   public static void main(String[] args) {
      B b = new B();
      
      b.name = "B 클래스";
      System.out.println(b.name);
   }
}


