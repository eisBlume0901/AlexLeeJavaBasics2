package Package1;
// Access 1 (Default) and Access 2 (Public) data's is accessible from each other.
public class Access2
{
    public static void main(String[] args)
    {
        Access1 a = new Access1();
        /* Data from Access 1 Default Access Modifier is accessible and can be
        called out by Public Access Modifier.
         */
        System.out.println(a.hours);
        //Output is 3
        System.out.println(a.minutes);
        //Output is 47

        //System.out.println(a.length);
        //Error is java: length has private access in Package1.Access1
        //System.out.println(a.width);
        //Error is java: length has private access in Package1.Access1

        System.out.println(a.name);
        //Output would be Mary Kate
        System.out.println(a.favoriteAnime);
        //Output would be Spirited Away
    }
}
