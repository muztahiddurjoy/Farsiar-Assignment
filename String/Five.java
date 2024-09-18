import java.util.*;
public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int vowels  = 0;
        int consonants = 0;
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels++;
            }else{
                consonants++;
            }
        }
        if(vowels!=0&&consonants!=0&&vowels%3==0 && consonants%5==0){
            System.out.println("Aaarr! Me Plunder!!");
        }
        else{
            System.out.println("Blimey! No Plunder!!");
        }
    }
}
