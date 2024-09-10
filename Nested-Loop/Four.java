import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            int sum = 0;
            int count = 0;
            
            if (X % 2 == 0) {
                X++;
            }
            
            
            while (count < Y) {
                sum += X;
                X += 2; 
                count++;
            }
            
            System.out.println(sum);
        }
        
        scanner.close();
    }
}
