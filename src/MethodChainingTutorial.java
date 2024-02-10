class Student //Class and constructor variable name should share same Name.
{
    String name;
    int grade;

    public Student setName(String name) //This is a constructor method. Setters
    {
        this.name = name;
        return this;
    }
    public Student setGrade(int grade) //This is a constructor method. Setters
    {
        this.grade = grade;
        return this;
            /* "this" keyword is used as a reference to the current object (public Student setGrade(int
            grade), for example, within an instance method or a constructor. Using this you can refer
            the members of a class such as constructors, variables, and methods.

            public Student setName(String name);
            public Student setAge(int grade);
            - are both methods and members of the class Student.

            When you return "this" from a method the current object will be returned.
             */
    }
}
public class MethodChainingTutorial
    /* Method chaining is the practice of calling different methods in a single line instead of calling
    other methods with the same object reference separately. Under this procedure, we have to write the
    object reference once and then call the methods by separating them with a (dot.).

    - Create a class which includes its methods that will be called out/referenced by the main method.
     */
{
    public static void main(String[] args)
    {
        Student s = new Student(); //Create a Student object named s.
        s.setName("Mary Kate");
        s.setGrade(99);
        /* However, having a lot of attributes for students would take up a lot of lines. Too redundant.
        Therefore, changed the return type from void to Student so that method chaining is possible.

        Older version
        public void setName(String name)
        {
            this.name = name;
        }
        public void setGrade(int grade)
        {
            this.grade = grade;
        }

        Better version
        public Student setName(String name)
        {
            this.name = name;
        }
        public Student setGrade(int grade)
        {
            this.grade = grade;
        }
         */
        s.setName("Mary Odette").setGrade(97);

        System.out.println(s.name);
        //Output would be Mary Odette
        System.out.println(s.grade);
        //Output would be 97

    }
    public static void main2(String[] args)
    {
        String citrusFruit = "orange";
        System.out.println(citrusFruit.toUpperCase());
        //Output would be ORANGE
        System.out.println(citrusFruit.toUpperCase().charAt(0));
        //Output would be O
        String color = "blue";
        int b = color.concat(" is my favorite color!").chars().toArray()[0];
        System.out.println(b);
        //Output would be 98

    }

}
