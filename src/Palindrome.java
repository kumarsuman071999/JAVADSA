// time complexity O(n)
class checkPalindrome{
    public boolean check(int[] arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1])
                return false;


        }
        return true;

    }


}


public class Palindrome {
    public static void main(String[] args){
        checkPalindrome ref= new checkPalindrome();
        int []arr={1,2,6,1};
        System.out.println(ref.check(arr));
    }

}
