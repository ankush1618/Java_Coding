package Arrays.MultiDimentionalArrays;

public class MaximumInMatrix {

    public static int maxMatrix(int matrix[][]){
        int n=matrix.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max=matrix[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                {2000, 3, 4},   //3-0-1
                {4, 50000, 9}, //3-1-1
                {40, 5001, 9000} //3-2-1
        };
        int max=maxMatrix(matrix);
        System.out.println("Maximum of Matrix is:"+max);
    }
}
