import java.util.Calendar;
import java.util.Date;

public class Main {
    public static long calculateDays(String startDate, String endDate)
    {
        Date sDate = new Date(startDate);
        Date eDate = new Date(endDate);
        Calendar cal3 = Calendar.getInstance();
        cal3.setTime(sDate);
        Calendar cal4 = Calendar.getInstance();
        cal4.setTime(eDate);
        return daysBetween(cal3, cal4);
    }

    public static void main(String[] args) {
        System.out.println(calculateDays("2012/02/1", "2012/02/7"));

    }

    /** Using Calendar - THE CORRECT WAY**/
    public static long daysBetween(Calendar startDate, Calendar endDate) {
        Calendar date = (Calendar) startDate.clone();
        long daysBetween = 0;
        while (date.before(endDate)) {
            date.add(Calendar.DAY_OF_MONTH, 1);
            daysBetween++;
        }
        return daysBetween;
    }
}