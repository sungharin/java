package exam01;

public class NullPointer {
   String data = null;
   
   public static void main(String[] args) {
      NullPointer np = new NullPointer();
      
      try {
         //np.data = new String("Hi");
         System.out.println(np.data.toString());
         System.out.println("It is OK!!");
      }
      catch(ClassCastException e) {
    	  System.out.println("Null Pointer!!");
      }
      finally {
    	  System.out.println("Exception module done.");
      }
      System.out.println("Program is running!!");
   }
}
