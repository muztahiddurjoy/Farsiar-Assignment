import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextInt();
        int age = scanner.nextInt();
        if(age<18){
            System.out.println("Your tax amount is 0 Tk");
        }
        else{
            if(amount<10000){
                System.out.println("Your tax amount is 0 Tk");
            }
            else if(amount>=10000&&amount<=20000){
                System.out.println("Your Tax amount "+(amount*0.05)+" Tk");
            }
            else{
                System.out.println("Your tax amount is "+(amount*0.1)+" Tk");
            }
        }
    }
}
