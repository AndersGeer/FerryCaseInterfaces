import java.rmi.server.UID;

/**
 * Created by geera on 20-Sep-16.
 */
public class CustomerInfoOnReservation extends CustomerId
{

    private String firstName;
    private String lastName;
    private int phoneNumber;

    public CustomerInfoOnReservation(int customerId, String firstName, int phoneNumber, String lastName) {
        super(customerId);
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
