import java.util.Scanner;
// time complexity O(n)
// space complexity O(n)
class Test3{

        public int factorial(int fact) throws NumberFormatException{


            if(fact>=0) {
                if (fact == 0) {
                    return 1;

                }

                return fact * factorial(fact - 1);
            }
            else {
                System.out.println("Enter number greater than zero: ");
                return -1;
            }



        }
    }
    public class FactorialRecursion8 {
    public static  void main(String[] args) throws  Exception{
        //base conditionr
        Test3 ref=new Test3();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the no for factorial: ");
        int n=sc.nextInt();

        System.out.println(ref.factorial(n));

    }

}
