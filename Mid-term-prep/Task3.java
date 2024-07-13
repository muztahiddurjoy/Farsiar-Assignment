import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        double slope = (y2-y1)/(x2-x1);
        System.out.println("Distance "+distance);  
        System.out.println("Slope "+slope);
        if(slope<0){
            System.out.println("Slope is negative");
        }
        else{
            System.out.println("Slope is positive");
        }
    }
}
