import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Divisors of "+num);
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
