import java.util.Scanner;
// space complexity is O(n)
class Test10{
    public static long Power(long power,long base){
        if(power==0){
            return 1;
        }
        long total= base*(Power(power-1,base));
        if(total==base){
            return base;
        }
        else {
            return total;
        }
    }

    // in this one test case failed base=2 power=0
    public static  long power2(long a,long b){
        long mid=0,result=0,finalresult=0;
        if(b==1 ){
            return a;
        }

        else {
            mid=b/2;
            result=power2(a,mid);
            finalresult=result*result;

            if(b%2==0){
                return finalresult;
            }

            else{
                return a*finalresult;
            }

        }
    }
}

public class PowerRecursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter  the value of Base:  ");
        long base=sc.nextLong();

        System.out.println("Enter the value of Power :");
        long power= sc.nextLong();
        long total=Test10.Power(power,base);
        System.out.println(total);

        long tota1= Test10.power2(base,power);
        System.out.println(tota1);






    }
}
