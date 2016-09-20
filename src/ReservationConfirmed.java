/**
 * Created by geera on 20-Sep-16.
 */
public class ReservationConfirmed extends ReservationId
{

    private boolean reservationConfirmed;

    public ReservationConfirmed(int id, boolean reservationConfirmed) {
        super(id);
        this.reservationConfirmed = reservationConfirmed;
    }

    public boolean isReservationConfirmed() {
        return reservationConfirmed;
    }
}
