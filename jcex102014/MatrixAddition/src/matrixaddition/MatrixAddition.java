package matrixaddition;
public class MatrixAddition {
    public static void main(String[] args) {
        //Initialization
        int[][] A = { 
            {2,4,5},
            {1,3,7},
            {6,2,8}
        };
        int[][] B = { 
            {1,3,1},
            {8,9,4},
            {5,3,2}
        };
        int[][] C = new int[3][3];
        //Processing
        for(int i=0;i<A.length;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
        //Display
        for(int i=0;i<A.length;i++){
            for(int j=0;j<3;j++){
                System.out.print(C[i][j]);
            }
            System.out.println();
        }
    } 
}
