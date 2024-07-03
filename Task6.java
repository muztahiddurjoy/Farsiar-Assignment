import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<0){
            System.out.println("Number is negative");
        }
        else if(number==0){
            System.out.println("Number is zero");
        }
        else{
            if(number%2==0){
                System.out.println("Number is positive and even");
            }
            else{
                System.out.println("Number is positive and odd");
            }
        }
    }
}
