import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = sc.nextInt();
        int height = sc.nextInt();
        for(int i=1;i<=height;i++){
            for(int j=1;j<=width;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
