package Package2;
import Package1.Access1;
//import package1.Access1 allows you to access another package data

public class Access3 extends Access1
    /*extends ClassName
    The extends keyword extends a class (indicates that a class is inherited from another class).
    In Java, it is possible to inherit attributes and methods from one class to another.
     */
{
    public static void main(String[] args)
    {
        Access1 a = new Access1();
        /* Access1 data types should be declared as public in order for it to be
        usable. Default Access1 is not accessible on another package unless its data
        type is declared as public.
         */
        System.out.println(a.hours);
        //Output is 3
        System.out.println(a.minutes);
        //Output is 47

        //System.out.println(a.length);
        //Error is java: length has private access in Package1.Access1
        //System.out.println(a.width);
        //Error is java: length has private access in Package1.Access1

        //System.out.println(a.name);
        //Error is java: name has protected access in Package1.Access1
        //System.out.println(a.favoriteAnime);
        //Error is java: favoriteAnime has protected access in Package1.Access1

        Access3 a3 = new Access3();
        System.out.println(a3.name);
        // Protected datatypes in Access1 is already accessible since we put an extends keyword.
        //public class Access3 extends Access1
        System.out.println(a3.favoriteAnime);

    }
}
