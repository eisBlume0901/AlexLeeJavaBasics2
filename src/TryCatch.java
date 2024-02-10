import java.util.Scanner;

public class TryCatch
{
    public static void main(String[] args)
    {
        int[] numbers = {4,5,1};
        System.out.println(numbers);
        /* System.out.println(numbers[3]);
        Output would be:

        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            at TryCatch.main(TryCatch.java:6)
         */
        try
        {
            int[] evens = {2,4,6,8,10};
            System.out.println(evens[5]);
        }
        catch(Exception e)
        {
            System.out.println("An exception happened! There is no index element for 5.");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("What's your favorite number? ");

        /* Output if you enter a non integer value
        Exception in thread "main" java.util.InputMismatchException
            at java.base/java.util.Scanner.throwFor(Scanner.java:943)
            at java.base/java.util.Scanner.next(Scanner.java:1598)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2263)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2217)
            at TryCatch.main(TryCatch.java:26)
         */
        try
        {
            int number = input.nextInt();
            System.out.println(number);
        }
        catch(Exception e)
        {
            System.out.println("Sorry, please enter a number");
        }

        try
        {
            int[] empty = null;
            System.out.println(empty[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Your array is out of bounds");
        }
        catch(Exception e)
        {
            System.out.println("Something else went wrong!");
        }
    }
}
