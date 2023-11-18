class Test17{
    public static  void InsertionSortAccending(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }

    public  static void insertionSortDecending(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1] < arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }

    }
}
public class InsertionSort17 {
    public static void main(String[] args) {
        int[] arr={20,40,11,19,27,45};
        Test17.InsertionSortAccending(arr);
        Test16.Display(arr);
        Test17.insertionSortDecending(arr);
        Test16.Display(arr);

    }
}
