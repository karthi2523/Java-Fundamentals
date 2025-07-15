public class problem {
    public static void main(String[] args) {
        String s = "training";
        String result = "";

        for(char ch:s.toCharArray()){
            if(result.indexOf(ch)==-1){
                result += ch;
            }
            }
            System.out.println(result);
        }
        }
