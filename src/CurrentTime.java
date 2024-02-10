import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime
{
    public static void main(String[] args)
    {
        Date currentDate = new Date();
        System.out.println(currentDate); //Output example would be Wed Nov 16 12:37:04 PST 2022

        //Formatting date

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss");
        //Pattern is hh represents hours, mm represents minutes, and ss represents seconds
        System.out.println(timeFormat.format(currentDate)); //Output example would be 12:40:12

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM. dd,yyyy");
        System.out.println(dateFormat.format(currentDate)); //Output example would be Nov. 16, 2022
        //https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html

        SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat1.format(currentDate)); //Output example would be 11/16/2022

        SimpleDateFormat WeekDay = new SimpleDateFormat("EEEE");
        System.out.println(WeekDay.format(currentDate)); //Output would be Wednesday

        SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
        System.out.println(clockFormat.format(currentDate)); //Output would be 12:49 PM
    }
}
