

public class InvertedNumberPyramid {
   public InvertedNumberPyramid() {
   }

   public static void main(String[] var0) {
      byte var1 = 5;

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3;
         for(var3 = 0; var3 < var2; ++var3) {
            System.out.print("  ");
         }

         for(var3 = var1 - var2; var3 > 0; --var3) {
            System.out.print("" + var3 + " ");
         }

         System.out.println();
      }

   }
}
