import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number%5==0&&number%7==0){
            System.out.println("Divisible by both");
        }
        else if(number%5==0&&number%7!=0){
            System.out.println("Invalid: Divisible by 5 only");
        }
        else if(number%7==0&&number%5!=0){
            System.out.println("Invalid: Divisible by 7 only");
        }
        else{
            System.out.println("No");
        }
    }
}
