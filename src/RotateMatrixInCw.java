// time complexity o(n)
// space complexity O(1)

class Test{
    public void rotateMatrix(int[][] matrix){
        // taking trnspose -> intercgange row into col
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }

    }

    public void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                System.out.print(" " + mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    // swap left and right index
    public void swapColumn(int[][]matrix){
        for(int i=0;i<matrix.length;i++){
            int leftIndex=0;
            int rightIndex=matrix.length-1;
            while(leftIndex<rightIndex){
                int temp=matrix[i][leftIndex];
                matrix[i][leftIndex]=matrix[i][rightIndex];
                matrix[i][rightIndex]=temp;
                leftIndex++;
                rightIndex--;

            }
        }
    }



}


public class RotateMatrixInCw {
    public static  void main(String[] args){
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Test test= new Test();
        test.rotateMatrix(matrix);
        test.display(matrix);
        test.swapColumn(matrix);
        test.display(matrix);



    }

}
