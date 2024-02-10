import java.util.ArrayList;

public class Exceptions
{
    public static void main(String[] args)
    {
        /* Exception is an event, which occurs during the execution of a program, that
        disrupts the normal flow of program's instructions. When an error occurs within a method,
        the method creates an object and hands it off to the runtime system.
         */

        String[] pets = {"dog","cat","monkey"};
        System.out.println(pets[0]);
        /* System.out.println(pets[3])
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        Index 3 out of bounds for length 3 at Exceptions.main(Exceptions.java:11)

        Exception means not following the rule specified by Java or method.
         */
        ArrayList<String> list = new ArrayList<>();
        /* list.get(0);
        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            at java.base/java.util.Objects.checkIndex(Objects.java:385)
            at java.base/java.util.ArrayList.get(ArrayList.java:427)
            at Exceptions.main(Exceptions.java:21)
         */

        ArrayList<String> list1 = null;
        /* list.get(0);
        null means an empty set. It does exist but it is empty.
        Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
            at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
            at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
            at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
            at java.base/java.util.Objects.checkIndex(Objects.java:385)
            at java.base/java.util.ArrayList.get(ArrayList.java:427)
            at Exceptions.main(Exceptions.java:32)
         */
    }
}
