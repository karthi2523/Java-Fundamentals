import java.util.Arrays;
import java.util.Scanner;
class arr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array elements: " + Arrays.toString(arr));

       int arr1[] = new int[5];
       System.out.println("Enter 5 elements:");
         for(int i = 0; i < arr.length; i++) {
              arr[i] = sc.nextInt();
         }

         int max = arr[0];
         int min = arr[0];      

            for(int i = 1; i < arr.length; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
            }

            System.out.println("Maximum element: " + max);
       
       

    
}
}