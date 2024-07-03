import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float greatest,lowest;
        if(num1>num2){
            if(num1>num3){
                greatest = num1;
                if(num3<num2){
                    lowest=num3;
                }
                else{
                    lowest = num2;
                }
            }
            else{
                greatest=num3;
                lowest = num2;
            }
        }
        else{
            if(num2>num3){
                greatest=num2;
                if(num3<num1){
                    lowest=num3;
                }
                else{
                    lowest=num1;
                }
            }
            else{
                greatest=num3;
                lowest=num1;
            }
        }
        System.out.println("Maximum number is "+greatest);
        System.out.println("Minimum number is "+lowest);
    }
}
