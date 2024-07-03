public class FirstTry{
    public static void main(String args[]){
        int num =2;
        int count = 1;
        while(count<=6){
            if(count%2==0){
                System.out.println(num*(-2));
            }
            else{
                System.out.println(num*(2));
            }
           num+=2;
           count++;
        }
    }
}