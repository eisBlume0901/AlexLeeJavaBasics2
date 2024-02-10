/* Getter method returns its value while a setter method sets or updates its value.
Getters and setters are also known as accessors and mutators, respectively.

Please check class Account for more details.
 */
public class GettersAndSetters
{
    // Attributes inside the class GettersAndSetters can be used and interacted with the methods.
    String name;
    int age;
    public static void main(String[] args)
    {
        GettersAndSetters GS = new GettersAndSetters();

        GS.sayHappyBirthday("Mary Kate");
    }

    public static void sayHappyBirthday(String name)
    {
        System.out.println("Happy Birthday " + name);
    }
}
