public class StringComparisonEqualsvsEqualsEquals
{
    public static void main(String[] args)
    {
        String a = "lemur";
        String b = "lemur";

        //Create new object
        String c = new String("lemon");
        String d = new String ("lemon");
        /* Constructor is a block of codes similar to the method. It is called
        when an instance of the class is created. At the time of calling constructor,
        memory for the object is allocated in the memory.
         */
        if (a==b) //Output is true
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        if (c == d) //Output is false
            /* c and d are objects. You cannot compare both of them using a relational operator ==.
            Therefore use a string method equals().

            Furthermore, c and d are different objects. However, they have the same string content.
            equals() method only verifies the parameter for the same data object.

            c and d are new and unique objects.
            c is storing a different object and d is also doing the same although they have the same
            value.
             */
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        if (c.equals(d))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        String e = new String("Nayuta"); //Output is false
        //Nayuta is a String object
        if (e == "Nayuta") //Nayuta is a String text
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        String randomWords = "RanDOM cAsES";

        if (randomWords.toLowerCase().equals("random cases")) //Output is true
            // RanDOM cAsES is changed to lowercase version of this string which then verifies
            // that it is equal to random cases.
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
