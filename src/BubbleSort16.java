// time complexity O(n^2)
// space complexity O(1)

class Test16{
    // accending order sorting
    public static  void M1(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-i-1);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }


    public static   boolean Display(int[] arr){
        int n= arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        return true;

    }
    // decending order sorting
    public static void M2(int[] arr){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<(n-i-1);j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }

    }

}
public class BubbleSort16 {
    public static void main(String[] args) {
        int[] arr={20,50,10,40,100,90};
        Test16.M1(arr);
        Test16.Display(arr);
        Test16.M2(arr);
        Test16.Display(arr);

    }
}
