package GetInput;

//This is used to get the input from the user from   keyboard
import java.util.Scanner;

class GetInput {
    public static void main(String[] args){
        int a,b,c;
        //this line is must to get the varibale 
        Scanner input = new Scanner(System.in);
        //System.in is input stream which is used to get the input from the user
        System.out.println("Enter Valuer of a");
        a = input.nextInt();
        // this line is used to get the integer value from the user
         System.out.println("Enter Value of b;");
        b= input.nextInt();
        //this line is used to get the integer value from the user

        c=a+b;
        System.out.println("Value of A + B is :" + c);

        input.close();
        //this line is used to close the scanner object to prevent memory leak 
    }
}