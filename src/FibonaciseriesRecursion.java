import java.util.Scanner;


//Exponential time complexity
// space complexity o(n)
// time complexity O(2^n)
class Test9{
    public int fibnaciSum(int n){
        if(n==0 || n==1) {
            return n;
        }


        return fibnaciSum(n-1)+fibnaciSum(n-2);
    }
    int pre=0,cur=1,n3;
    public void fibnaciSeries(int num){
        if(num>0){

            n3=pre+cur;
            pre=cur;
            cur=n3;
            System.out.println(n3);


            fibnaciSeries(num-1);

        }

    }

}

public class FibonaciseriesRecursion {


    public static void main(String[] args) {
        Test9 ref= new Test9();
        //System.out.println(ref.fibnaciSum(3));
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(0);
        System.out.println(1);
        ref.fibnaciSeries(n-2);

    }
}
