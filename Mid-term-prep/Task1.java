import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int quantity = sc.nextInt();
        //
        String item="";
        float price=0;
        if(index==1){
            item  = "Hot Dog";
            price = 4;
        }
        else if(index==2){
            //repeat
        }
            System.out.println("item: "+item);
            System.out.println("Quantity: " +quantity);
            System.out.println("Price: "+quantity*price+"$");
    }
}