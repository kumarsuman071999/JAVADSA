// time complexity o(n)  , space complexity o(1)
class reverse{

    public void reversearray(int[] arr){
        int n=arr.length;
       for(int i=0;i<n/2;i++){
           int temp=arr[i];
           arr[i]=arr[n-i-1];
           arr[n-i-1]=temp;



       }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }



    }




}

public class ReverseArray {
    public static void main(String[] args){
        int arr[]={1,2,3,4};
        reverse ref=new reverse();
        ref.reversearray(arr);

    }
}
