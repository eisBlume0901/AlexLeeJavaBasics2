import java.util.Scanner;

public class NullPointerException extends Throwable {
    public static void main(String[] args)
    {
        /* NullPointerException is a runtime exception, so we do not need to catch it in the program.
        It is raised in an application when we are trying to do some operation on null where an
        object is required.
         */
        String animal = "Rabbit";
        System.out.println(animal);

        // String empty = null; // empty is existing, but it is empty (no elements inside)
        // System.out.println(empty.length());
        /* Output would be:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "empty" is null
        at NullPointerException.main(NullPointerException.java:13)
         */

        // Null cannot be assigned to primitive data types (integer, double, long, float)
        // Scanner scan = null;
        // scan.nextInt();
        /* Output would be:
        Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.util.Scanner.nextInt()" because "scan" is null
        at NullPointerException.main(NullPointerException.java:23)
         */

        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextInt());
        /* Input something first then scan/displayed the results.
         */
    }
}
