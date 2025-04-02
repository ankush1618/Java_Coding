package Arrays.MultiDimentionalArrays;

public class SumOfPrimaryDiagonal {

    public static void main(String[] args) {
        int matrix[][] = {
                {2, 3, 5},   //3-0-1
                {4, 5,  9}, //3-1-1
                {5, 1, 5} //3-2-1
        };
        int sum=sumPrimaryDiagonals(matrix);
        System.out.println("Sum of Secondary Diagonal is: "+sum);
    }

    private static int sumPrimaryDiagonals(int[][] matrix) {
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
        }
        return sum;
    }
}
