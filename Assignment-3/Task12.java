import java.util.Scanner;
public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka)");
        int amount  = scanner.nextInt();
        System.out.println("Enter the amount, customer gave(Taka)");
        int given = scanner.nextInt();
        int difference = given-amount;

        int hundred = 0;
        int fifty=0;
        int twenty=0;
        int ten=0;
        int five=0;
        int two=0;
        int one=0;

        if(difference<0){
            System.out.println("Please pay "+(amount-given)+" more.");
        }
        else{
            System.out.println("The returned amount is "+difference+" taka.");
            hundred = difference/100;
            System.out.println("100 taka note :"+hundred);
            difference=difference-(hundred*100);

            fifty = difference/50;
            System.out.println("50 taka note :"+fifty);
            difference=difference-(fifty*50);

            twenty = difference/20;
            System.out.println("20 taka note :"+twenty);
            difference=difference-(twenty*20);

            ten = difference/10;
            System.out.println("10 taka note :"+ten);
            difference=difference-(ten*10);

            five = difference/5;
            System.out.println("5 taka note :"+five);
            difference=difference-(five*5);

            two = difference/2;
            System.out.println("2 taka coin :"+two);
            difference=difference-(two*2);

            one=difference;
            System.out.println("1 taka coin :"+one);
        }
    }
}
