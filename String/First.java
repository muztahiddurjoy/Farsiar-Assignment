import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        for(int i=0;i<text.length();i++){
            int letter = (int) text.charAt(i); // character : A, int : 65
            if(letter>=97 && letter<=122){
                letter = letter-32;
            }
            System.out.print((char)letter);
        }
    }
}