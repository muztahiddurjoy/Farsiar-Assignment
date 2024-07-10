import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i= 1;
        int odd = 1;
        System.out.print("The Number of terms ");
        int term = sc.nextInt();
        System.out.println("The odd numbers are");
        while(odd<=term){        
            if(i%2==1){
                System.out.println(i);
                sum+=i;
                odd++;
            }
            i++;
        }
        System.out.println("The Sum of odd Natural Number up to "+term+" is :"+sum);
    }
}