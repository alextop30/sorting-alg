/**
 * Created by alex on 6/20/16.
 */
public class Date implements Comparable<Date>
{

    //month day and year members
    private final int day;
    private final int month;
    private final int year;

    //constructor -- set the month, day and year
    Date(int m, int d, int y) {
        day = d;
        month = m;
        year = y;
    }

    //getters
    public int get_day() { return day; }
    public int get_month() { return month; }
    public int get_year() { return year; }

    //implement the method
    public int compareTo(Date dif)
    {
        if (this.day < dif.day)
            return -1;
        if (this.day > dif.day)
            return 1;
        if(this.month > dif.month)
            return 1;
        if(this.month < dif.month)
            return -1;
        if(this.year > dif.year)
            return 1;
        if(this.year < dif.year)
            return -1;

        return 0;
    }

    public String toString ()
    {
        return month + "/" + day + "/" + year;
    }

}
