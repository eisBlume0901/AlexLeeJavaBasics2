import java.util.HashSet;
import java.util.Iterator;

/* HashMap stores elements in form of key-value pair. Each element has its
corresponding key which is required for its retrieval during iteration. It allows duplicate
values but not duplicate keys. Its insertion method is add().

HashSet stores only objects. It is an implementation of Set Interface which does not
allow duplicate value. It is slower than HashMap. Its insertion method is put().

 */
public class HashSetTutorial
{
    public static void main(String[] args)
    {
        HashSet<String> citrus = new HashSet<>();
        citrus.add("lemon");
        citrus.add("orange");
        citrus.add("lime");
        citrus.add("kalamansi");
        citrus.add("dalandan");

        System.out.println(citrus);
        //Output would be [orange, lemon, dalandan, kalamansi, lime]

        citrus.remove("kalamansi");
        citrus.remove("dalandan");
        System.out.println(citrus);
        //Output is now [orange, lemon, lime]
        //citrus.clear() removes every element inside the set

        System.out.println(citrus.size());
        //Output would be 3

        System.out.println(citrus.contains("orange"));
        //Returns true

        System.out.println(citrus.isEmpty());
        //Returns false since the set contains an element

        HashSet<Integer> numbers = new HashSet();
        numbers.add(11);
        numbers.add(9);
        numbers.add(10);
        numbers.add(15);
        numbers.add(25);
        System.out.println(numbers);
        //Output would be [11, 9, 25, 10, 15]

        //Displaying it in an array
        Object[] n = numbers.toArray();
        //Syntax Object[] not int[]
        System.out.println(n[0]);
        //Returns 9

        System.out.println(numbers.hashCode());
        //Returns 70

        Iterator<Integer> repeat = numbers.iterator();
        while(repeat.hasNext())
        // while loop will end until there is no elements left inside the set.
        {
            System.out.println(repeat.next());
            //Output would be 9, 25, 10, 11, 15 in each line.
        }
    }
}
