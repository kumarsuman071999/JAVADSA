

//| 1  1  1  1  |
//        | 1  1  1  1  |
//        | 1  1  1  1  |
//        | 1  1  1  1  |
//
//        apply row major sum
//
//        | 1  2  3  4  |
//        | 1  2  3  4  |
//        | 1  2  3  4  |
//        | 1  2  3  4  |
//
//        apply cloumn major sum
//
//        | 1  2  3  4  |
//        | 2  4  6  8  |
//        | 3  6  9 12  |
//        | 4  8 12 16  |
//
//        let r1=2 c1 =2 r2=3 c2=3
class Test1{
    public void normalApproch(int [][]matrix,int r1,int c1,int r2,int c2){
        int sum=0;


        for(int i=r1;i<=r2;i++){
            for(int k=c1;k<=c2;k++){

                sum=sum+matrix[i][k];



            }

        }
        System.out.println("sum is: " + sum);


    }
    public void prefixSumApproch(int [][]matrix1 ,int r1,int c1,int r2,int c2){
        // traverse through row major sum

        for(int i=0;i<matrix1.length;i++){
            int sum=0;
            for(int j=0 ; j<matrix1[0].length;j++){
                sum=sum+matrix1[i][j];
                matrix1[i][j]=sum;


            }
        }
        // traverse through column major sum
        for(int i=0;i<matrix1[0].length;i++){
            int sum1=0;
            for(int j=0 ; j<matrix1.length;j++){
                sum1+=matrix1[j][i];
                matrix1[j][i]=sum1;

            }
        }

        int total= matrix1[r2][c2] - matrix1[r1-1][c2] -matrix1[r2][c1-1] + matrix1[r1-1][c1-1];
        System.out.println(total);
    }


    public void display(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int k=0;k<matrix.length;k++){
                System.out.print("   "+matrix[i][k]+"   ");
            }
            System.out.println();
        }
    }
}

public class PrefixSum2DArray {
    public static void main(String[] args){
        int[][] matrix= {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int[][] matrix1={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int[][] matrix2= new int[5][5] ;

        Test1 ref= new Test1();
        ref.normalApproch(matrix,1,0,2,3);
        ref.display(matrix);

        // new approch
        ref.prefixSumApproch(matrix1,1,1,3,3);
        ref.display(matrix1);





    }

}
