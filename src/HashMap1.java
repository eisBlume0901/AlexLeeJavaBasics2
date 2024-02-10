import java.util.HashMap;

public class HashMap1
{
    public static void main(String[] args)
    {
        int a = 10;
        System.out.println(a);
        String b = "hello";
        int[] c = {1,2,3};

        HashMap<String, Integer> colorsNumbers = new HashMap<>();
        //                 key,value
        colorsNumbers.put("red",1);
        colorsNumbers.put("orange",2);
        colorsNumbers.put("yellow",3);
        colorsNumbers.put("green",4);
        colorsNumbers.put("blue",5);

        System.out.println(colorsNumbers);
        // Output would be {red=1, orange=2, green=4, blue=5, yellow=3}
        System.out.println(colorsNumbers.get("blue"));
        // Output would be 5

        HashMap<String,String> userPassword = new HashMap<>();
        userPassword.put("Mary Kate","eisBlume_1019");
        userPassword.put("Mary Odette","SunshineYellow_52");
        userPassword.put("Fevie","brownEarthling_15*");
        System.out.println(userPassword);
        /*Output would be {Mary Kate=eisBlume_1019,
        Mary Odette=SunshineYellow_52, Fevie=brownEarthling_15*} */

        userPassword.remove("Mary Odette");
        //Syntax: .remove(key)
        System.out.println(userPassword);
        //Output would be {Mary Kate=eisBlume_1019, Fevie=brownEarthling_15*}

        System.out.println(userPassword.containsKey("fevie"));
        //Syntax: .containsKey(key)
        //Returns false
        System.out.println(userPassword.containsValue("brownEarthling_15*"));
        //Syntax: .containsValue(value)
        //Returns true

        System.out.println(userPassword.size());
        //Syntax: .size()
        //Returns 2

        System.out.println(userPassword.replace("Fevie","earthyGreenie_1510"));
        //Syntax: .replace(key,newValue)
        //Returns the old value brownEarthling_15*

        System.out.println(userPassword);
        //{Mary Kate=eisBlume_1019, Fevie=earthyGreenie_1510}

        System.out.println(userPassword.values());
        //Syntax: .values()
        //[eisBlume_1019, earthyGreenie_1510]

        System.out.println(userPassword.keySet());
        //Syntax: .keySet()
        //[Mary Kate, Fevie]
    }
}
