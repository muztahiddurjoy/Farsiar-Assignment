import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String operator = scanner.next();
        if(operator.equals("+")){
            System.out.println(a+b);
        }
        else if(operator.equals("-")){
            System.out.println(a-b);
        }
        else if(operator.equals("*")){
            System.out.println(a*b);
        }
        else if(operator.equals("/")){
            System.out.println(a/b);
        }
    }
}
