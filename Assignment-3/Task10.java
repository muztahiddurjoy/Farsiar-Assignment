import java.util.Scanner;
public class Task10{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N=sc.nextInt();
       int dig=0;
       int y=N;
       int x=N;
       for(int i=1;i<x;i++){
           x=x/10;
           dig++;
       }
       for(int i=dig;i>=0;i--){
            int power = 1;
            for(int j=0;j<(dig-1);j++){
                power = power * 10;
                
            }
            dig--;
             System.out.print(y/power);
             if(i>0){
                System.out.print(",");
             }
        
            y=y % power;
        }
}
}