import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x>=1) {
            if(x%2==0){
                //Even
                x=x/2;
            }
            else if(x%2==1&&x!=1){
                //Odd
                x=(x*3)+1;
            }
            System.out.println(x);
        }
    }
}
