import java.lang.*;
import java.util.*;


class MyFirst
{

   public static void main(String arg[])
    {

           Scanner s = new Scanner(System.in);
            int a, b, c;

           System.out.println("Enter two numbers");

            a = s.nextInt();
            b = s.nextInt();
            c = a + b ;
          System.out.println("Sum is " + c);

    }
}