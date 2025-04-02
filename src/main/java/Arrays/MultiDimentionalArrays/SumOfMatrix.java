package Arrays.MultiDimentionalArrays;

public class SumOfMatrix {




    public static void main(String[] args) {
        int matrix[][] = {
                {2, 3, 4},   //3-0-1
                {4, 5, 9}, //3-1-1
                {4, 1, 0} //3-2-1
        };
        int max=sumMatrix(matrix);
        System.out.println("Maximum of Matrix is:"+max);
    }

    private static int sumMatrix(int[][] matrix) {
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                sum+=matrix[i][j];
            }
        }
        return sum;
    }
}
