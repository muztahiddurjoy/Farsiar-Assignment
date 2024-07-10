import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nonNegative = 0;
        int negative = 0;
        System.out.println("Enter an Integer");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println("Enter Number "+i+" :");
            int a = sc.nextInt();
            if(a>=0){
                nonNegative++;
            }
            else{
                negative++;
            }
        }
        System.out.println(nonNegative+ " Non-negative numbers");
        System.out.println(negative+" Negative numbers");
    }
}
