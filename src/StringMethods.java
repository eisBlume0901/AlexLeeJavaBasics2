public class StringMethods
{
    public static void main(String[] args)
    {
        String name = "Mary Kate";
        System.out.println("Name: " + name);
        System.out.println("Uppercase: " + name.toUpperCase()); //MARY KATE
        System.out.println("Lowercase: " + name.toLowerCase()); //mary kate
        System.out.println("First character: " + name.charAt(0)); //M
        //charAt(index)
        System.out.println("Length: " + name.length()); //9 (plus with whitespace)
        System.out.println("Last character: " + name.charAt(8)); //e (whitespace excluded)
        System.out.println("Substring: " + name.substring(4,9)); //Kate
        //range(4,9) start counting at 5 up to 8
    }
}
