import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sum=0;
        double avg = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("N=");
        int N = sc.nextInt();
        System.out.println("Enter the "+N+" numbers");
        for (int i = 0; i < N; i++) {
            int userIn = sc.nextInt();
            sum+=userIn;
        }
        avg = sum/N;
        System.out.println("The Sum of "+N+" number is: "+sum);
        System.out.println("The Average is: "+avg);
    }
}
