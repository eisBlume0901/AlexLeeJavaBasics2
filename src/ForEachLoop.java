import java.util.ArrayList;

public class ForEachLoop
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.print(i);
            // Output would be 01234
        }
        System.out.println();

        String[] cars = {"BMW M2", "Veloster N", "GTI"};

        for (String car : cars)
        {
            System.out.println(car);
            /* Output would be
            BMW M2
            Veloster N
            GTI
             */
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(10);
        numbers.add(25);
        numbers.add(30);
        numbers.add(45);
        System.out.println(numbers); // Output is [9, 10, 25, 30, 45]

        for (Integer number : numbers)
        {
            System.out.println(number);
        }
        /* Output is
        9
        10
        25
        30
        45
         */

        //Counter part of for each loop using for loop only

        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println(numbers.get(i));
        }
        /* Output is
        9
        10
        25
        30
        45
         */
    }
}
