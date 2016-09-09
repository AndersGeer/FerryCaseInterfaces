import java.util.Collection;

/**
 * Created by geera on 09-Sep-16.
 */
public interface ICustomerFrontEnd

{


    /**
     * @return      A collection of IDateFerryDTO items, consisting of ferry lines and dates
     */
    Collection<IDateFerryDTO> CreateReservation();

    //Gets info of ferry line and date chosen
    //Returns list of times for selected ferry line and dates
    /**
     * @param       A DTO with the ferry line and date chosen.
     * @return      A collection of IDateFerryDTO items, consisting of ferry lines and dates
     */
    Collection<ILineDateTimesDTO> FerryAndDate(IFerryChosenDTO chosenFerryAndTime);

    //Gets info of time selection
    void SelectedTime(ISelectedTimeDTO timeSelection);

    //Gets information on customer
    //Returns a complete information regarding the resavation made by the customer
    ReservationDTO SubmitInformation(CustomerInfoDTO customer);

    //Customer confirms infomation
    void ConfirmedInfo();

    //In case the entered info is wrong, customer submits changed info - this is it.
    void InformationChanged(ReservationDTO changedInfo);
}
