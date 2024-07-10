import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit =0;
        int num = sc.nextInt();

        while(num>0) {
            num = num/10;
            digit++;
        }
        System.out.println("Total digits = "+digit);
    }
}
