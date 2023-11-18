import java.util.Scanner;
// at time you can climb 1 step or 2 step
// total step =n
class  test8{
    int pre=0,cur=1 ,last;
    public  int countStair(int n){

        if(n>0){

            last=pre+cur;
            pre=cur;
            cur=last;

            countStair(n-1);


        }

        return last;
    }


}
public class Staircase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter stair");
        int n= sc.nextInt();
        test8 ref= new test8();
        System.out.println(ref.countStair(n));

    }
}
