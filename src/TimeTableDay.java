import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import java.util.Collection;
import java.util.Date;

/**
 * Created by geera on 20-Sep-16.
 */
public class TimeTableDay extends TimeTableId
{

    private Collection<Date> timeTableForDay;
    private Collection<Date> noAvailableReservations;

    public TimeTableDay(int timeTableId, Collection<Date> noAvailableReservations, Collection<Date> timeTableForDay) {
        super(timeTableId);
        this.noAvailableReservations = noAvailableReservations;
        this.timeTableForDay = timeTableForDay;
    }

    public void AddTimeToCollection(Date instance)
    {
        timeTableForDay.add(instance);
    }

    public void AddTimeToNoAvailableReservations(Date instance)
    {
        noAvailableReservations.add(instance);
    }

    public Collection<Date> getTimeTableForDay() {
        return timeTableForDay;
    }

    public Collection<Date> getNoAvailableReservations() {
        return noAvailableReservations;
    }
}
