import java.util.Scanner;

public class FinallyKeywordTryCatch
{
    public static void main(String[] args)
    {
        try
        {
            int a = 5/0;
        }
        catch(Exception e)
                /* catch block is an exception handler that handles the type of exception indicated by
                its argument. Instead of throwing a red exceptions in our program and turning a red warning
                in Intellij, catch is a good thing that could friendly display the problem coded
                by the programmer for users.
                 */
        {
            System.out.println(e);
            //java.lang.ArithmeticException: / by zero - was printed along with finally
        }
        finally
        {
            System.out.println("This is in 'finally', it always get run!");
            //java.lang.ArithmeticException: / by zero
        }

        try
        {
            int a = 5/1;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("This is in 'finally', it is always get run!");
            //This is in 'finally', it is always get run! - this is the only output for this block scope.
        }

        Scanner input = new Scanner(System.in);
        //System.out.println(input.next());
        //input.close();
        /* close() method closes the scanner. If this scanner has not yet been closed, then if its
        underlying readable also implements the Closeable interface then the readable's code method
        will be invoked.

        In this case, I tried to run the code and type cats. It then displayed cats after that I cannot
        input anything anymore. However, removing the input.close() would let you input something again.
         */

        try
        {
            System.out.println(input.next());
        }
        catch(Exception e) //You can stack multiple catch statements
        {
            System.out.println(e);
        }
        finally
        {
            input.close(); //It closes the scanner and will always get run even the exception code
            // is already printed out
        }
    }
}
