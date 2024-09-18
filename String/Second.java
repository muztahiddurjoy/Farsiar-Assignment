import java.util.Scanner;
/**
 * Second
 */
public class Second {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String text = sc.next();
      String reversed = ""; 
      for (int i = text.length()-1; i >= 0; i--) {
        char ch = text.charAt(i);
        reversed += ch;
      }
      System.out.println(reversed.equals(text));
    }
}