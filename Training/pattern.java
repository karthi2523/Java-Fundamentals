import java.util.Scanner;


public class pattern {
    Scanner sc = new Scanner(System.in);
    public void pattern1(){
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
        for(int j = 1;j <= i;j++ ){
            System.out.print("*");
        }
        System.out.println("");
       }
}
    public static void main(String[] args) {
        pattern obj = new pattern();
        
        

       
       
    }
}
