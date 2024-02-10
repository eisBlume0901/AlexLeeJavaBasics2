package Package1;
/* Access modifiers
- let us give access to other files about the data

Default:
- we do not explicitly declare an access modifier for a class, method, etc.
A variable or method declared without any access control modifier is available
to any other class in the same package.
Public:
- a class, method, or variable can be declared as public, and it means that it is accessible
from any class.
Private:
- specifies that the member can only be accessed in its own class.
Protected:
- specifies that the member can only be accessed within its own package (as with package-private)
and, in addition, by a subclass of its class in another package. It only lets other packages know
about the data inside it if it's related to the original class.
 */
public class Access1
{
    public int hours = 3;
    /* int hours = 3; allows it to be accessible to the same package only(package1)
    by public.
    public int hours = 3; allows it to be accessible to another package(package2)
     */
    public int minutes = 47;

    private final int length = 45;
    /* private int length = 45;
    private int width = 50;
    It is only accessible for class Access1 and not to Access2 even they are at the same package.
    Especially for Access3, it is not accessible.

    private final int length - updated Nov. 26, 2022
     */
    private final int width = 50;
    // private final int length - updated Nov. 26, 2022
    protected String name = "Mary Kate";
    /*
    Protected gives access to the same package(package1). That is why Access2 has access for Access1.
    However, it is inaccessible or available for Access3 since it is from another package(package2).
    protected String name = "Mary Kate"; and
    protected String favoriteAnime = "Spirited Away";
     */
    protected String favoriteAnime = "Spirited Away";

}
