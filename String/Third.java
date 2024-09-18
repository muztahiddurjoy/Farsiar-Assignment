import java.util.Scanner;
public class Third{
     public static void main( String [] args){
     Scanner sc= new Scanner(System.in); 
     String text= sc.next();
     char text2= sc.next().charAt(0);
          for (int i= 0; i< text.length();i++){
               if (text.charAt(i)==text2){
                    System.out.println();
               }
               else{
                    System.out.print(text.charAt(i));
               }
     }
     }
}