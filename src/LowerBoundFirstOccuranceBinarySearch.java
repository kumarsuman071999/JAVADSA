// mistake => always remember define mid inside while loop because it changing each time
class Test4{
    public static int firstOccurance(int[] arr,int ele){
        int low=0 , high=arr.length -1;

        int result=-1;

        while (high>=low){

            int mid=low + (high-low)/2;

            if(arr[mid]== ele){
                result=mid;
                high=mid-1;

            }

            else if(ele<arr[mid]){
                high=mid -1;

            }
            else  {
                low=mid+1;
            }
        }
        return result;
    }
}
public class LowerBoundFirstOccuranceBinarySearch {
    public static void main(String[] args) {
        //Test4 ref= new Test4();
        int[] arr={7,7,7,7,9,9,9};
        //ref.firstOccurance(arr,7);
        System.out.println(Test4.firstOccurance(arr,7));

    }
}