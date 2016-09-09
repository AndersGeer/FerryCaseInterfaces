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

    /**
     * @param  chosenFerryAndTime   A DTO with the ferry line and date chosen
     * @return                      A collection of IDateFerryDTO items, consisting of times for the selected ferry time and date
     */
    Collection<ILineDateTimesDTO> FerryAndDate(IFerryChosenDTO chosenFerryAndTime);

    //
    /**
     * @param  timeSelection   Gets info of time selection
     */
    void SelectedTime(ISelectedTimeDTO timeSelection);

    /**
     * @param  customer   A DTO with with customer info - possibly encrypted
     * @return            A reservationDTO
     */
    ReservationDTO SubmitInformation(CustomerInfoDTO customer);

    /**
     * Allows customer to confirm the information without changes
     */
    void ConfirmedInfo();

    /**
     * Allows customer to change info if needed
     * @param  customer   A DTO with with customer info - possibly encrypted
     */
    void InformationChanged(ReservationDTO changedInfo);
}
