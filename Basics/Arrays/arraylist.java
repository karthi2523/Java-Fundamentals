package Arrays;
import java.util.ArrayList;
public class arraylist {
    public static void main (String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie"); 
        
        String str = names.get(1);
        System.out.println("The second name in the list is: " + str);
        System.out.println("Names in the list: " + names);       
    }
}
