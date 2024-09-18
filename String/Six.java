import java.util.Scanner;
public class Six {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";
        String word = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (c == ' ') {
                result += word + " ";
                word = ""; 
            } else {
                word = c + word;
            }
        }
        result += word;
        System.out.println(result);
    }
}
