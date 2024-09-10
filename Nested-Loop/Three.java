import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int number = sc.nextInt();
            int divisors = 0;
            if (number%2!= 0) {
                break;
            }
            else{
                for(int i=1;i<=number;i++){
                    if(number%i==0){
                        divisors++;
                    }
                }
                System.out.println(number+" has "+divisors+" divisors");
            }

        }
    }
}
