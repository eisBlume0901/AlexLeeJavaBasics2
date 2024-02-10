import java.util.Stack;
/* Stack is a linear data structure that is used to store the collection of objects.
It is based on Last-In-First-Out (LIFO). Stack class provides different operations such as
push, pop, search, etc.
 */
public class StackTutorial
{
    public static void main(String[] args)
    {
        Stack<String> games = new Stack<>();
        games.add("Call of Duty"); //Last-in
        games.add("Guitar Hero");
        games.add("Super Monkey Ball"); //First-out

        System.out.println(games);
        // Output is [Call of Duty, Guitar Hero, Super Monkey Ball]
        System.out.println(games.pop());
        // Output is Super Monkey Ball
        System.out.println(games);
        // Output is [Call of Duty, Guitar Hero]. Super Monkey Ball is first popped out.
        System.out.println(games.pop());
        // Output is Guitar Hero
        System.out.println(games);
        // Output is [Call of Duty]. Guitar Hero is first popped out.

        Stack<String> books = new Stack<>();
        books.add("Howl's Moving Castle");
        books.add("The Lord of the Rings");
        books.add("Colorless Tsukuru Tazaki and His Years of Pilgrimage");

        System.out.println(books.peek());
        /* peek() method is used to retrieve or fetch the first element of the Stack or the element
        present at the top of the Stack.

        Output is Colorless Tsukuru Tazaki and His Years of Pilgrimage
         */

        System.out.println(books);
        /* Output is [Howl's Moving Castle, The Lord of the Rings, Colorless Tsukuru Tazaki and His Years of Pilgrimage]
        All books are still stacked and no books has been removed.
         */

        Stack<Character> tower = new Stack<>();
        // Yellow lego - top/first out
        // Blue lego
        // Red lego - bottom/last in
        tower.add('R');
        tower.add('B');
        tower.add('Y');

        System.out.println(tower);
        // Output is [R, B, Y]

        System.out.println(tower.peek());
        // Output is Y

        System.out.println(tower.contains('P'));
        // Output is false since there is no P element inside tower.

        System.out.println(tower.empty());
        // Output is false since it is not empty. It has elements [R, B, Y]

        System.out.println(tower.get(1));
        // Output is B

        System.out.println(tower.get(0));
        // Output is R

        System.out.println(tower.set(0,'G'));
        /* set() is used to replace any particular element in the stack created using the Stack class
        with another element.
        Syntax:
        (int index, Object element)

        Output is R
         */

        System.out.println(tower);
        // Output is now updated to [G, B, Y]

        System.out.println(tower.size());
        // Output is 3
    }
}
