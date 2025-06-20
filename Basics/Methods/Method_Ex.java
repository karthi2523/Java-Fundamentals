package Methods;

public class Method_Ex {
    
         void display(){
        //void is used to define a method which does not return any value
        //otherwise we can use int, float, double, char, String etc to return a value
            int a, b, c;
            a = 100;
            b = 200;
            c = a + b;
         System.out.println("Value of A + B is :" + c);
         }
         // This is a method in Java
 
         // above method is method without arguments and without return type

         void displayWithArgs(int a, int b) {
            // this is a method with arguments and without return type
            int sum = a + b;
            System.out.println("Sum of " + a + " and " + b + " is: " + sum);
         }

         //method with string arguments and without return type
         void str(String a, String b, String c) {
            System.out.println("Result = " +a + b + c);
         }
         
         //method with return type
         int mul(int a , int b, int c){
            c = a * b;
            System.out.println("Multiplication of " + a + " and " + b + " is: "+ c);
            return c;
         }
        public static void main(String[] args) {
        Method_Ex obj = new Method_Ex();// creating an object of the class Method_Ex
        obj.display();
        obj.displayWithArgs(30, 50);
        obj.str("Hello ", "World ", "Java!");
        obj.mul(10, 20, 0);
         // calling the display method using the object of the class
         // this is how we call a method in java
         System.out.println("This is a method example in Java.");}
    
}
