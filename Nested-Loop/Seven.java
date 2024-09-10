import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
         for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("  ");  
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
        

    }
}
