import java.util.Collection;
import java.util.Date;

/**
 * Created by geera on 09-Sep-16.
 */
public interface ICustomerFrontEnd

{


    /**
     * @return      A collection of IDateFerryDTO items, consisting of ferry lines and dates
     */
    Collection<FerryLineName> CreateReservation();

    //Gets info of ferry line and date chosen
    //Returns list of times for selected ferry line and dates
    /**
     * @param       ferryId expects FerryLineDTO
     * @param       date exåects date
     * @return      A collection of IDateFerryDTO items, consisting of ferry lines and dates
     */
    Collection<TimeTableDay> FerryAndDate(FerryLineId ferryId, Date date);

    //Gets info of time selection
    void SelectedTime(Date timeSelection);

    //Gets information on customer
    //Returns a complete information regarding the resavation made by the customer
    Reservation SubmitInformation(CustomerInfo customer);

    //Customer confirms infomation
    void ConfirmedInfo();

    //Returns a confirmation after the customer has confirmed the reservation
    ReservationConfirmed ReservationConfirmed(ReservationId id);


    //In case the entered info is wrong, customer submits changed info - this is it.
    void InformationChanged(Reservation changedInfo);
}
