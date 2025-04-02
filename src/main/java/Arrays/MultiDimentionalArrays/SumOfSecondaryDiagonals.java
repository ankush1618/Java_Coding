package Arrays.MultiDimentionalArrays;

public class SumOfSecondaryDiagonals {


    public static int sumSecondaryDiagonals(int [][]matrix){
        int n=matrix.length;
        int sum=0;
        for(int i=0;i<matrix.length;i++){
                sum+=matrix[i][n-1-i];
        }
        return sum;
    }


    public static void main(String[] args) {
        int matrix[][] = {
                {2, 3, 5},   //3-0-1
                {4, 5,  9}, //3-1-1
                {5, 1, 0} //3-2-1
        };
        int sum=sumSecondaryDiagonals(matrix);
        System.out.println("Sum of Secondary Diagonal is: "+sum);
    }
}
