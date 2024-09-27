import java.util.Scanner;
public class First{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+": "+arr[i]);
        }
        System.out.println("Enter another number: ");
        int num = sc.nextInt();
        int[] newArr = new int[N+1];
        for (int j = 0; j < N; j++) {
            newArr[j] = arr[j];
        }
        newArr[newArr.length-1] = num;
        System.out.println("After resizing the array:");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}