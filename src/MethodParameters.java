public class MethodParameters
{
    public static void main(String[] args)
    {
        sayHi(); //Output is hi
        sayAlex(); //Output is Alex
        saySomething("Mary"); //Output is Hi! Mary
        //                  argument = Mary
        printInfo("Mary Kate",21); //Output is Mary Kate is 21 years old.
        System.out.println(add(5,6)); //Output is 11.
        int result = add(5,19);
        System.out.println(result); //Output is 24.
    }
    public static void sayHi()
    {
        System.out.println("hi");
    }
    public static void sayAlex()
    {
        System.out.println("Alex");
    }
    //Alternative for sayHi() amd sayAlex()
    public static void saySomething(String name)
    //                              parameter = String name
    {
        System.out.println("Hi! " + name);
    }
    public static void printInfo(String name, int age)
    {
        System.out.println(name + " is " + age + " years old.");
    }
    public static int add(int a, int b)
    {
        return a + b;
    }
}
