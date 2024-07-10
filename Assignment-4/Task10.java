import java.util.Scanner;
public class Task10{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num=sc.nextInt();
       int digit=0;
       int a=num;
       int b=num;
       for(int i=1;i<b;i++){
           b=b/10;
           digit++;
       }
       for(int i=digit;i>=0;i--){
            
            int pow = 10;
            for(int j=0;j<(digit-1);j++){
                pow = pow * 10;
                
            }
            if(a>10){
             System.out.print(a/pow);
            }
            else{
                System.out.print(a);
            }
             if(i>0){
                System.out.print(",");
             }
        
            a=a % pow;
            digit--;
        }
}
}