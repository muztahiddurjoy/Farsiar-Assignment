import java.util.Scanner;
public class Task2{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if(marks<=100&&marks>=90){
            System.out.println("Your Grade is A");
        }
        else if(marks<90&&marks>=85){
            System.out.println("Your Grade is A-");
        }
        else if(marks<85&&marks>=70){
            System.out.println("Your Grade is B");
        }
        else if(marks<70&&marks>=57){
            System.out.println("Your Grade is C");
        }
        else if(marks<57&&marks>=50){
            System.out.println("Your Grade is D");
        }
        else{
            System.out.println("Your Grade is F");
        }
    }   
}
