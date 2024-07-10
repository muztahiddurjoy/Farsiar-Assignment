import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            if(i%5==0&&i%3!=0){
                System.out.println(i);
            }
        }
    }
}