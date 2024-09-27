import java.util.Scanner;

public class TaskTenA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = convertToCm(16);
        System.out.println(t+" cm");
    }   
    public static double convertToCm(int inches) {
        double cm = inches*2.54;
        return cm;
    }
}
