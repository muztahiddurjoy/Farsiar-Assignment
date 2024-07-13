import java.util.Scanner;
public class Task4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if(a!=0){ 
            double root1 = (-b+Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a); // With +
            double root2 = (-b-Math.sqrt(Math.pow(b,2)-(4*a*c)))/(2*a); // With -
            System.out.println("Root 1: "+root1);
            System.out.println("Root 2: "+root2);
        }
        else{
            System.out.println("Impossible to calculate");
        }

    }
}