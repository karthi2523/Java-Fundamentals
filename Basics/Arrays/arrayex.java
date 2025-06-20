package Arrays;

public class arrayex{
    /*public static void main(String[] args) {
        int [] Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i<Numbers.length; i++) {
            sum += Numbers[i];
            
        }
        System.out.println("The sum of the array elements is: " + sum);

        String [] a = new String[20];
        a[0] = "Hello";
        a[1] = "World"; 
        System.out.println(a[0] + " " + a[1]+"!!");
    }*/

    void method1(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i=0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("The sum of the array elements is: " + sum);
    }

    void method2(){
        String[] a = new String[20];
        a[0] = "Hello";
        a[1] = "World";
        System.out.println(a[0] + " " + a[1] + "!!");
    }

    public static void main(String[] args) {
        arrayex obj = new arrayex();
        obj.method1();
        obj.method2();
    }
}
