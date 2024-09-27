import java.util.Scanner;
public class TaskSeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};

        System.out.println("Prime Numbers");
        for (int i = 0; i < arr.length; i++) {
              int divisors = 0;
              for (int j = 1; j <= arr[i]; j++) {
                if (arr[i] % j == 0) {
                     divisors++;
                }
              }
              if(divisors == 2) {
                System.out.println(i +":"+arr[i]);
              }
        }
        System.out.println("Perfect Numbers");
        for (int k = 0; k < arr.length; k++) {
            int sum = 0;
            for (int l = 1; l < arr[k]; l++) {
                if (arr[k] % l == 0) {
                    sum += l;
                }
            }
            if (sum == arr[k]) {
                System.out.println(k +":"+arr[k]);
            }
        }
    }
}