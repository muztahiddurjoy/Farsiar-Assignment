import java.util.Scanner;
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if(a==b&&b==c&&c==a){
            System.out.println("This is a Equilateral triangle");
        }
        else if(a==b||b==a||c==a){
            System.out.println("This is Isosceles triangle");
        }
        else{
            System.out.println("This is Scalene triangle");
        }
    }
}
