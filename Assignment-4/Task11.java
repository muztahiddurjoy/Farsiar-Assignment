import java.util.Scanner;
public class Task11{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    
         int N=sc.nextInt();  
         int sum=0;
         int div=0;
        for(int i=1;i<=N;i++){
         
            if  (N%i==0){
              div++;
              if(i!=N){
                sum+=div;
              }
            }
        }
        //For loop shesh
        //Print shuru
        if (div>3){
            System.out.println(N+ " is not a prime number");
          }
          else {
            System.out.println(N+ " is a prime number");
          }
          if (sum==N){
            System.out.println(N+ " is a perfect number "); 
          }
          else{  
            System.out.println(N+ " is not a perfect number");
          }
        }
}