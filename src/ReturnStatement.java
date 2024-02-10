import java.util.ArrayList;

public class ReturnStatement
{
    public static void printAMessage()
    {
        System.out.println("This is our first method!");
    }
    public static void add(int a, int b)
    {

        System.out.println(a+b);
        /* Return statement causes the program to control to transfer back to the caller
        of a method. A return type may be a primitive type (int, float, double), or a
        reference type or void type (returns nothing)
         */
    }

    public static int addition(int x, int y)
    {
        // Instead of declaring void, declare the data type to allow a return statement
        return x + y;
    }

    public static String wordcaller()
    {
        return "Hello, there!";
    }

    public static String upperCase(String word)
    {
        return word.toUpperCase();
    }

    public static int[] ArrayfromInts(int c, int d, int e)
    {
        int[] array = new int[3];
        array[0] = c;
        array[1] = d;
        array[2] = e;
        return array;
    }

    public static ArrayList<Integer> evens(int A, int B, int C)
    {
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        evenNumbers.add(A);
        evenNumbers.add(B);
        evenNumbers.add(C);
        return evenNumbers;
    }
    public static void main(String[] args)
    {
        printAMessage(); //Output would be This is our first method!
        add(5,6); //Output would be 11

        int summation = addition(5, 4);
        System.out.println(summation); //Output would be 9
        /* A return statement works to return a value from the method and useful when
        making calculation that requires a result and further used that result for calculation
        or manipulation of that method.
        */

        String shouting = wordcaller();
        System.out.println(shouting); //Output would be Hello, there!

        String slogan = upperCase("i won the game!");
        System.out.println(slogan); //Output would be I WON THE GAME!

        int[] myfavNums = ArrayfromInts(9, 10, 15);
        System.out.println(myfavNums[0]); //Output would be 9
        System.out.println(myfavNums[1]); //Output would be 10
        System.out.println(myfavNums[2]); //Output would be 15

        ArrayList<Integer> numbers = evens(10,11,12);
        System.out.println(numbers); //Output would be [10, 11, 12]
    }
}
