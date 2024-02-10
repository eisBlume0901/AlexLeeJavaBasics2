import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day number: ");
        int day = input.nextInt();

        switch (day)
        {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> throw new IllegalStateException("Invalid day number");
        }

        System.out.println("Enter dog: ");
        String dog = input.next();

        switch (dog)
        {
            case "pomeranian" -> System.out.println("small dog");
            case "great dane" -> System.out.println("large dog");
            default -> throw new IllegalStateException("Dog breed not found");
        }
    }
}
