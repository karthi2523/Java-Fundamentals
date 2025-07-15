import java.util.Arrays;
import java.util.Scanner;
public class problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String name = sc.nextLine();

       char[] arr1 = name.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
    }
}
