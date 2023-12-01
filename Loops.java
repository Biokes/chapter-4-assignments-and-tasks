public class Loops {

  public static void main(String[] args) {
      for(int i = 0; i < 6; i++) {
          printChar(' ', i);
          printChar('*', 6-i);
          System.out.println();
      }        

      for(int i = 0; i <= 6; i++) {
         printChar(' ', 6-i);
         printChar('*', i);
         System.out.println();
      }
      System.out.println();
    }
 private static void printChar(char ch, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(ch);
        }
    }

}