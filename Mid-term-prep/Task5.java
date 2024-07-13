import java.util.Scanner;
public class Task5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int change = sc.nextInt();
        int last = sc.nextInt();
        
        for (int i = first; i <= last; i+=change) {
            System.out.print(i+", ");
        }
    }
}