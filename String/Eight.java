import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String result = "";
        boolean lower = true; 
        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            String letter = String.valueOf(c);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if (lower) {
                    result += letter.toLowerCase(); 
                } else {
                    result += letter.toUpperCase(); 
                }
                if(lower==true){
                    lower=false;
                }
                else{
                    lower=true;
                }
            } else {
                result += letter;
            }
        }
        System.out.println(result);
    }
}
