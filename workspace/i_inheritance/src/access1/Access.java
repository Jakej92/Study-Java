package access1;

public class Access {
   int data1;
   public int data2;
   protected int data3;
   private int data4;
   
   public Access() {;}
   
   public int getData4() {
      return data4;
   }

   public void setData4(int data4) {
      this.data4 = data4;
   }

   public static void main(String[] args) {
      Access access = new Access();
   }
}