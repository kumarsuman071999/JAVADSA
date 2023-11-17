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






    }
}
