import java.util.Scanner;
public class jagged{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] jaggedArray = new int[row][col];

        for(int i = 0; i < row; i++){
           for(int j = 0; j < col; j++){
                jaggedArray[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}