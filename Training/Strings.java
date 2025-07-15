import java.util.*;

class Student{
    int a = 10,b=20;

    public int add(){
        return a + b;
    }
}

class Student1{
    String a = "apple", b = "banana";
    public String toString(){
        return a + " " + b;
    }
}



class Strings {

   
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // // String[] str1 = new String[4];    
        // for(int i = 0;  i<str1.length;i++){
        //    str1[i] = sc.nextLine();

        // }
        // Arrays.sort(str1);
        // for(String name : str1){
        //     System.out.println(name);
        // }

        // String str1 = "Apple";
        // int len = 234;
        // String str3 = str1;

        
        // System.out.println(str1.concat(len + ""));
        // Student s = new Student();
        // Student1 s1 = new Student1();
        // reverse r = new reverse();
        // System.out.println(s1);
        // System.out.println(r);

        StringBuffer s1= new StringBuffer("Hello");
        s1.insert(5, " Beautiful");
}
}