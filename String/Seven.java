import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String result = "";
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.indexOf(c) == -1) { 
                result += c;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (str1.indexOf(c) == -1) { 
                result += c;
            }
        }
        System.out.println(result.toUpperCase());
    }
}
