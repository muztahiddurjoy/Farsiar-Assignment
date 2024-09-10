import java.util.Scanner;



/**
 * The `First` class is a program that generates prime numbers up to a given limit.
 * It takes user input for the limit and prints the prime numbers in ascending order.
 * 
 * The algorithm used in this program is based on a nested loop approach. It starts with a
 * number and checks if it is prime by iterating through all numbers up to that number.
 * If the count of divisors is less than or equal to 2, the number is considered prime and
 * printed. The process continues until the desired number of prime numbers is generated.
 * 
 * This program uses the `Scanner` class to read user input from the console.
 * 
 * Example usage:
 * 
 * ```
 * Enter the limit: 10
 * 
 * Prime numbers up to 10:
 * 2
 * 3
 * 5
 * 7
 * ```
 */
public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 2;
        int N = sc.nextInt();
        int prime=0;

        while(prime<N){
            int count = 0;
            for(int i=1;i<=start;i++){
                if(start%i==0){
                    count++;
                }
            }
            if(count<=2){
                System.out.println(start);
                prime++;
            }
            
            start++;
        }
    }
}
