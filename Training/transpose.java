public class transpose {
    public static void main(String[] args) {
        int[] [] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        int rows = matrix.length;
        int cols = matrix.length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
