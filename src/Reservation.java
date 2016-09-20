import java.util.Date;

/**
 * Created by geera on 20-Sep-16.
 */
public class Reservation extends ReservationShort
{

   private CustomerInfoOnReservation customerInfo;

    public Reservation(int id, Date dateForReservation, FerryLineId ferryLine, CustomerInfoOnReservation customerInfo) {
        super(id, dateForReservation, ferryLine);
        this.customerInfo = customerInfo;
    }

    public CustomerInfoOnReservation getCustomerInfo() {
        return customerInfo;
    }
}
