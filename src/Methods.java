public class Methods
{
    public static void multiply(int a, int b)
    {
        welcome(); //Method welcome was called
        System.out.println(a*b);
    }

    public static void divide(int a, int b)
    {
        System.out.println(a/b);
    }
    public static void welcome()
    {
        System.out.println("Welcome to our calculator!");
    }
    public static void main(String[] args)
    {
        welcome();
        multiply(6,5);
        divide(30,5);
        /* Output would be:
        Welcome to our calculator!
        Welcome to our calculator!
        30
        6
         */
    }
}
