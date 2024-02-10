public class NestedForLoops
{
    public static void main(String[] args)
    {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Today is a good day!");
            //Output would be Today is a good day! five times
        }

        //for loops for arrays
        String[] fruits = {"Mango","Peach","Strawberry","Blueberry"};
        for (String myFavoriteFruits : fruits)
        {
            System.out.println(myFavoriteFruits);
            //Output would be Mango, Peach, Strawberry, Blueberry printed in every new line
        }

        for(int i = 0; i <= 3; i++)
        {
            System.out.println(fruits[i]);
            //Output would be Mango, Peach, Strawberry, Blueberry printed in every new line
        }

        System.out.println("-------------");

        //Nested For Loops
        //Example 1
        String[][] colors = {{"Red","Green","Blue"},
                             {"Cyan","Magenta","Yellow"}};

        for(int row = 0; row < 2; row++) // row < 2 represents two rows
        {
            for(int col = 0; col < 3; col++) // col < 3 represents three columns
            {
                System.out.println(colors[row][col]); //[row][column]
                //Output would be Red, Green, Blue, Cyan, Magenta, Yellow printed in every new line
            }
        }
        //Example 2
        for(int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.println("i: " + i + ", j: " + j);
                /* output would be:
                i: 0, j: 0
                i: 0, j: 1
                i: 0, j: 2
                i: 0, j: 3
                i: 0, j: 4
                i: 1, j: 0
                i: 1, j: 1
                i: 1, j: 2
                i: 1, j: 3
                i: 1, j: 4
                 */
            }
        }
    }
}
