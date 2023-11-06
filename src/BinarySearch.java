
class find{
    public int findSearch(int []arr,int n){
        int low=0;
        int high=arr.length-1;


        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==n){
                return mid;
            }
            else if(n>arr[mid]){
                low=mid+1;
            }

            else {
                high=mid-1;
            }
        }

        return -1;

    }
}
public class BinarySearch {
    public static void main (String[] args) {
        int [] arr={2,4,6,10,12};
        find ref=new find();
        int re=ref.findSearch(arr,90);
        System.out.println(re);
    }
}
