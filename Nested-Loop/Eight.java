import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Armstrong numbers: ");

        for (int i = start; i <= end; i++) {
            int number = i;
            int sum = 0;
            
            int digits = 0;
            int temp = number;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }
            
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, digits);
                number /= 10;
            }

            if (sum == i) {
                System.out.println(i);
            }
        }

    }
}
