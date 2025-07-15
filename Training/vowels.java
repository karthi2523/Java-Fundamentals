import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        String[] vowels={"a","e","i","o","u"};
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char[] arr = str.toCharArray();

        String result = "";

        for(int i = 0; i < arr.length; i++) {  
            boolean isVowel = false; 
            for(int j = 0; j < vowels.length; j++) 
            {
                if (Character.toLowerCase(arr[i]) == vowels[j].charAt(0)) {
                    isVowel = true;
                    break;
                }
            }

            if(isVowel){
                result += "*";
            }else{
                result += arr[i];
            }
        }

        System.out.println(result);
    }
}
