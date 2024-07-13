import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = 0;
        for (double i = 1; i <= x; i++) {
            if(i%4==0){
                y -= (1 / i);
            }
            else{
                y += (1 / i);
            }
        }
        System.out.println("Y = "+y);
    }
}
