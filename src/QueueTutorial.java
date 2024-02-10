import java.util.LinkedList;
import java.util.Queue;

/* Queue is used to hold elements about to be processed in a First In First Out (FIFO)
order. In layman's term, it is first come, first served.

LinkedList inherently implements the linked list data structure. It is a linear data structure
where the elements are not stored in contiguous locations and every element is a separate object
with a data part and address part.
 */
public class QueueTutorial
{
    public static void main(String[] args)
    {
        Queue<String> examinees = new LinkedList<>();
        examinees.add("Mary Kate");
        examinees.add("John");
        examinees.add("Helena");
        examinees.add("Charlie");
        System.out.println(examinees);
        // Output is [Mary Kate, John, Helena, Charlie]

        System.out.println(examinees.poll());
        /* poll() returns and removes the element at the front end of the container. It deletes the element
        in the container. The method does not throw an exception when the Queue is empty, it returns null
        instead.

        Output is Mary Kate
         */
        System.out.println(examinees);
        // Output is [John, Helena, Charlie]. Mary Kate from the last queue line is pulled out.

        System.out.println(examinees.peek());
        /* peek() is used to retrieve or fetch the first element. The element retrieved does not get
        deleted or removed from the Queue.

        Output is John
         */

        Queue<Character> alphabets = new LinkedList<>();
        alphabets.add('A');
        alphabets.add('B');
        alphabets.add('C');
        alphabets.add('D');
        alphabets.add('E');

        System.out.println(alphabets);
        // Output is [A, B, C, D, E]

        System.out.println(alphabets.poll());
        // Output is A

        System.out.println(alphabets);
        // Output is [B, C, D, E]

        System.out.println(alphabets.peek());
        // Output is B

        System.out.println(alphabets);
        // Output is [B, C, D, E]

        System.out.println(alphabets.size());
        // Output is 4

        System.out.println(alphabets.contains('D'));
        // Output is true

        System.out.println(alphabets.toArray()[1]);
        /* Output is C.
        toArray() returns an array containing all the values in Queue.
        toArray() [int index] returns the element specified by the index.
         */

    }
}
