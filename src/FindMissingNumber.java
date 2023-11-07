
class findMissing{
    public static int find(int[] arr){
        int sum=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];

        }
        int m=arr.length+1;
        int sumNaturalNo=m*(m+1)/2;

        return sumNaturalNo-sum;
    }


}
public class FindMissingNumber {
    public static  void main(String[] args){
        int[] arr={1,3,4,5};
        System.out.println(findMissing.find(arr));
    }
}
