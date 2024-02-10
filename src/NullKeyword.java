import java.util.ArrayList;

public class NullKeyword
    //Null Keyword refers to nothing
{
    public static void main(String[] args)
    {
        String a = "Hello, World!";
        int b = 6;
        double c = 5.25;

        String empty = null;
        System.out.println(empty);
        /* Output is null which means empty.
        Weak Warning: Value 'empty' is always 'null'.
         */
        ArrayList list = null;
        System.out.println(list);
        /* Output is null
        Weak Warning: Value 'list' is always 'null'.
         */

        String d = null;
        if (d == null) //Warning d == null is always true
        {
            System.out.println("is null"); //Output is -> is null.
        }

        String e = null;
        if(e.equals(null))
        {
            System.out.println("is null");
            /*
            Exception in thread "main" java.lang.NullPointerException:
            Cannot invoke "String.equals(Object)" because "e" is null
                at NullKeyword.main(NullKeyword.java:30)
             */
        }

        String f = null;
        if(f.isEmpty())
        {
            System.out.println("is null");
            /*
            Exception in thread "main" java.lang.NullPointerException:
            Cannot invoke "String.isEmpty()" because "f" is null
                at NullKeyword.main(NullKeyword.java:33)

             */
        }
    }
}
