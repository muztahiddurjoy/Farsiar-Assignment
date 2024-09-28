public class Second {
    public static void main(String[] args) {
        int arr[] = {9, -5, 7, 9, -5, 5, 7};
        int newArr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int duplicate = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == newArr[j]) {
                    duplicate++;
                }
            }
            if (duplicate>0) {
                newArr[i] = 0;
            }
            else{
                newArr[i] = arr[i];
            }
        }
        System.out.println("Before Removing Duplicates");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nAfter Removing Duplicates");
        for (int i = 0; i < newArr.length; i++) {
         
                System.out.print(newArr[i]+" ");
         
        }
    }
}
