package Patterns;
import java.util.Scanner;
public class rightTriangle {

    public void triangle1(int n){ 
        int printVal=0;
         for (int i = 1 ; i<n; i ++){
            printVal = i%2 == 0 ? 0:1;
            for(int j = 1; j<=i ; j++){
                System.out.print(printVal+" ");
                printVal = printVal == 0 ? 1:0;
            }
            System.out.println();
         }
}


public void triangle2(int n){
         for (int i = 1 ; i<n; i ++){
            for(int j = 1; j<=i ; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    
}

public void triangle3(int n){
    int printVal=1;
    for (int i = 1; i<=n; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print(printVal++ + " ");
        }
        System.out.println();
    }
}

public void triangle4(int n){
    
    for (int i = 1; i<=n; i++){
        for(int j=1 ; j<=n-i+1 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public void triangle5(int n){
    
    for (int i = 1; i<=n; i++){
        for(int j=1 ; j<=n-i+1 ; j++){
            System.out.print(n-i+1);
        }
        System.out.println();
    }
}

public void triangle6(int n){
    
    for (int i = 1; i<=n; i++){
        for(int j=1 ; j<=n-i+1 ; j++){
            System.out.print(j);
        }
        System.out.println();
    }
}

public void triangle7(int n){
    
    for (int i = 1; i<=n*2-1; i++){
        int col = i > n ? (2*n)-i : i;
        for(int j=1 ; j<=col ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int n = sc.nextInt();


         rightTriangle obj = new rightTriangle();
         obj.triangle1(n);   
         obj.triangle2(n);  
         obj.triangle3(n);  
         obj.triangle4(n);
         obj.triangle5(n);
         obj.triangle6(n);
         obj.triangle7(n);
    }
}

