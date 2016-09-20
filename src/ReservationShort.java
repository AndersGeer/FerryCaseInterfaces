import java.util.Date;

/**
 * Created by geera on 20-Sep-16.
 */
public class ReservationShort extends ReservationId
{
    private Date dateForReservation;
    private FerryLineId ferryLine;

    public ReservationShort(int id, Date dateForReservation, FerryLineId ferryLine) {
        super(id);
        this.dateForReservation = dateForReservation;
        this.ferryLine = ferryLine;
    }

    public Date getDateForReservation() {
        return dateForReservation;
    }

    public FerryLineId getFerryLine() {
        return ferryLine;
    }
}
