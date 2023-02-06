

//1. Factorial using recursion
public class Factorial {

        public static int Factorial(int i)
        {
            if(i==0)
                return 1;

            else
                return i* Factorial(i-1);
        }
        public static void main (String[] args ){


            System.out.println (Factorial(10));
        }





}
