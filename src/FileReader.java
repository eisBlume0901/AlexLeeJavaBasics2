import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader
{
    public static void main(String[] args) throws IOException
    {
        File file1 = new File("D:\\CEU Computer Science\\Java");
        System.out.println(file1);

        File file = new File("D:\\FileReaderJava\\unrequitedlove.txt");
        System.out.println(file);

        Scanner scan = new Scanner(file);

        String fileContent = "Haiku of Unrequited Love \n";
        /* Look at the file, you would see that it would be:
            Haiku of Unrequited Love
            Your stormy gaze would
            Never fall on me. I, who,
            Shy from the limelight
         */
        while(scan.hasNext())
        //It will loop and stop until there is no line
        {
            fileContent = fileContent.concat(scan.nextLine() + "\n");
            // System.out.println(scan.nextLine());
            /* Output for System.out.println would be:
            Your stormy gaze would
            Never fall on me. I, who,
            Shy from the limelight
             */
        }

        FileWriter writer = new FileWriter("D:\\CEU Computer Science\\Java\\love.txt");
        /*Importing from D:\\FileReaderJava\\unrequitedlove.txt to D:\\CEU Computer Science\\Java\\love.txt
        It means that the filepath and file name imported. Please see the file explorer to verify.

        FileWriter class is used to write character-oriented data to a file.
         */
        writer.write(fileContent);
        writer.close();
    }
}
