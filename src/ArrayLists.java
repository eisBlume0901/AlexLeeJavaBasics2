import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        String[] fruits = new String[3];
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        System.out.println(fruits[1]);
        System.out.println(fruits); //Would print gibberish like [Ljava.lang.String;@4dd8dc3


        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        fruitList.remove("Strawberry"); //Output would be [Mango, Apple, Strawberry]
        //fruitList.clear(); Output would be [] since it clears all elements inside the ArrayList
        System.out.println(fruitList.contains("Raspberry"));
        //Output would be false since Raspberry is not included in the element

        System.out.println(fruitList); //Output would be [Mango, Apple, Strawberry,Watermelon]
    }
}
