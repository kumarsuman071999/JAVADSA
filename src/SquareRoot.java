class Test5{
    public static int m1(int n){
        int result=-1;
        int floor=-1;
        for(int i=2;i<n;i++){
            if(i*i==n){

                result=i;
            }
            else if(i*i<n){
                floor=i;
            }
        }
        if(result!=-1){
            return result;
        }
        else if(floor!=-1) {
            return floor;
        }
        return -1;

    }

    public static int m2(int n){
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        int low=0;
        int high=n-1;
        int check=-1;
        while (high>=low){
            int mid=low+(high-low)/2;

            if(mid*mid==n){
                return mid;
            }

            if(mid*mid<n){
                low=mid+1;
                check=mid;
            }
            else {
                high=mid-1;
            }

        }
        return check;
    }


}

public class SquareRoot {
    public static void main(String[] args) {
        int n=16;
        System.out.println(Test5.m1(n));
        System.out.println(Test5.m2(n));


    }
}
