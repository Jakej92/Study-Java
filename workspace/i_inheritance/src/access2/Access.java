package access2;

public class Access extends access1.Access {
   public static void main(String[] args) {
//      Access access = new Access();
      
      access1.Access access1 = new access1.Access();
      access1.setData4(20);
      System.out.println(access1.getData4());
   }
}
