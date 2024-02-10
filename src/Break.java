public class Break
{
    public static void main(String[] args)
    {
        int i = 0;
        while(i<3)
        {
            System.out.println("Hi!");
            break; // break exits the loop or switch
            // i++; will have an error (java: unreachable statement).
            // The order of the code matters which determines which will be executed first and last
        }

        int[] numbers = {10, 20, 30, 40, 50};
        for(int j = 0; j < numbers.length; j++)
        {
            if (numbers[j] == 30)
            {
                break; //Output would be only 10, 20
            }
            System.out.println(numbers[j]);
        }

        int k = 1;
        switch(k)
        {
            case 0:
                System.out.println("Zero!");
                break;
            case 1:
                System.out.println("One!");
                break;
            default:
                System.out.println("Nothing!");
        }

        for (int l = 0; l < 5; l++)
        {
            for (int m = 0; m < 3; m++)
            {
                System.out.println(l + " , " + m);
                /* Output without break       Output with break
                        0 , 0                      0 , 0
                        0 , 1
                        0 , 2
                        1 , 0                      1 , 0
                        1 , 1
                        1 , 2
                        2 , 0                      2 , 0
                        2 , 1
                        2 , 2
                        3 , 0                      3 , 0
                        3 , 1
                        3 , 2
                        4 , 0                      4 , 0
                        4 , 1
                        4 , 2

                 For output with break;
                    only l was printed out (l < 5)
                    0, 1, 2, 3, 4
                    and m has a value of 0

                    Therefore, it means that the second for loop's code was not executed
                 */
                break;
            }
        }
    }
}
