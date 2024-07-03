import java.util.Scanner;
public class Task13 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int num1 =scanner.nextInt();
        System.out.println("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input the 3rd number: ");
        int num3 = scanner.nextInt();
        if(num1==num2&&num2==num3&&num3==num1){
            System.out.println("All numbers are equal");
        }
        else if(num1!=num2&&num2!=num3&&num3!=num1){
            System.out.println("All numbers are different");
        }
        else{
            System.out.println("Neither all are equal or different");
        }
    }
}
