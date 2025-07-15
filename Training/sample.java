package Training;

import java.util.Scanner;

public class sample {

    public void method(int a, int b, int c ,int d ,int e, int f,int g){
        
        System.out.println(a-b+c%d/e*f-g);

    }

    public void method2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cgpa: ");
        float cgpa = sc.nextFloat();
        // System.out.println("You entered: " + n);
        System.out.println("Enter the no.of Arrear:");
        int arr = sc.nextInt();

        if(cgpa > 7.0 && arr == 0|| arr == 1){
            System.out.println("Eligible");
        }else if(cgpa > 7.5 && arr ==0){
            System.out.println("Eligible for MNC");
        }else if((cgpa>=6.5 && cgpa <=7.0)&&(arr == 0|| arr == 1)){
            System.out.println("Eligible");
        }else{
            System.out.println("not eliglible");
        }

        }
    

    public void swapping(){
        int a=10, b=20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public void swapping2(){
        int a=10,b=20;
        a = a + b; 
        b = a - b; 
        a=a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public void voting(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        System.out.print((n>0)?"a is positve":(n<0)?"a is negative":"a is zero");
        }

        public void xor(){
        
        int a = 10, b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping: a = " + a + ", b = " +b);
        }
    
    public static void main(String[] args){
        sample obj = new sample();
        // obj.method(10,7,1426,625,28,14,32);
        // obj.method2();
        // obj.swapping();
        // obj.swapping2();
        // obj.voting();
        obj.xor();
        
    }
}
