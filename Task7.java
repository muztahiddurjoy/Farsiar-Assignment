import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x<0){
            System.out.println("output: "+2*x);
        }
        else if(x<2&&x>=0){
            System.out.println("output: "+x+1);
        }
        else if(x<5&&x>=2){
            System.out.println("output: "+(Math.pow(x, 2)-1));
        }
        else{
            System.out.println("output: "+(3*Math.pow(x, 2))+1);
        }
    }
}
