import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number ");
            int num = sc.nextInt();
            if(num<0){
                break;
            }
            int result = num*num;
            System.out.println(num+"^2="+result);
            
        }
    }
}
