import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int check=n;
        while(n>=1){

            int rem= n%10;
            sum=sum+(int)Math.pow(rem,3);
            n=n/10;

        }

        if(sum== check){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
